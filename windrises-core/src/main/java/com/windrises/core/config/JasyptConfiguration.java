package com.windrises.core.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 对数据库信息进行加密
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/19 14:43
 */
@Configuration
public class JasyptConfiguration {


    @Bean("encryptorBean")
    public StringEncryptor stringEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        /*加密时的密钥*/
        config.setPassword("sensitiveInfo");
        /*加密算法*/
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        /*密文输出格式*/
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
    }

    public static void main(String[] args) {
        /*准备加密的字符串*/
        String a = "QWEQWE";
        JasyptConfiguration configuration = new JasyptConfiguration();
        StringEncryptor stringEncryptor = configuration.stringEncryptor();
        System.out.println("加密前:" + a);
        String encrypt = stringEncryptor.encrypt(a);
        System.out.println("加密后:" + encrypt);
        String decrypt = stringEncryptor.decrypt(encrypt);
        System.out.println("解密后" + decrypt);
    }
}
