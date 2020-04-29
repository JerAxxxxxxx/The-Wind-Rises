package com.windrises.core.entity.form;

import com.windrises.core.entity.po.BasePo;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 14:29
 */
@Data
public class BaseForm<T extends BasePo> {
    /**
     * From转化为Po，进行后续业务处理
     *
     * @param clazz
     * @return
     */
    public T toPo(Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(this, t);
        return t;
    }

    /**
     * From转化为Po，进行后续业务处理
     *
     * @param id
     * @param clazz
     * @return
     */
    public T toPo(Integer id, Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        t.setId(id);
        BeanUtils.copyProperties(this, t);
        return t;
    }
}
