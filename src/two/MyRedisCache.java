package two;

import java.lang.annotation.*;

/**
 * 自定义redis注解类
 */
@Documented
@Target({ElementType.METHOD})//在方法上用
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRedisCache {
    /**
     * 键
     */
    String key() default "";

    /**
     * 过期时间
     * @return
     */
    long expired() default -1;

    /**
     * 是否为查询操作，如果为写入数据库的操作，该值应该设置为false
     * @return
     */
    boolean select() default true;

    /**
     *更新标志，默认为true，为true时删除缓存中的值，重新查询数据库并加入缓存中
     */
    boolean updata() default true;

    /**
     * 是否更新标志
     * @return
     */
    boolean isUpdate() default true;
}
