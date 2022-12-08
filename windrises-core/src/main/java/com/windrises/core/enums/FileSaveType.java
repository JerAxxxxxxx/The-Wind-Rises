package com.windrises.core.enums;

/**
 * 文件保存类型
 *
 * @author Jeraxxxxxx
 * @date 2022-11-09 16:25:00
 */
public enum FileSaveType {
    /**
     * 不存在
     */
    NON_EXISTENT(-1, "不存在"),

    /**
     * 普通存储
     */
    NORMAL_STORAGE(0, "普通存储"),

    /**
     * 异或加密
     */
    XOR_ENCRYPTION(1, "异或加密");

    /**
     * 类型
     */
    private final Integer type;

    /**
     * 描述
     */
    private final String desc;

    FileSaveType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 获取文件保存类型
     *
     * @param type 类型
     * @return {@link FileSaveType} 文件保存类型枚举
     */
    public static FileSaveType getUserAreaType(Integer type) {
        for (FileSaveType value : FileSaveType.values()) {
            if (value.getType().equals(type)) {
                return value;
            }
        }
        return null;
    }

    public static String getEquipmentTypeDesc(Integer type) {
        for (FileSaveType value : FileSaveType.values()) {
            if (value.getType().equals(type)) {
                return value.desc;
            }
        }
        return null;
    }
}
