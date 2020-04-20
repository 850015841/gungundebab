package one;

/**
 * 问题2:处理缓存
 */
public class ProblemTwo {
    CachedData cache = new CachedData();
    //处理类
    public Object dellTask(Object key,Object value){
        //先查询缓存是否为空
        if(cache.selectCache(key) != null){
            return cache.selectCache(key);
        }else{
            //1.先保存数据
            //dao.save(key)
            //2.同步到缓存
            cache.addAndUpdateCache(key,value);
            //再查询
            return cache.selectCache(key);
        }
    }
}
