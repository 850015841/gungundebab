package one;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存类
 */
public class CachedData {
    static ConcurrentHashMap cacheMap = new ConcurrentHashMap();

    /**
     * 插入缓存
     */
    public boolean addAndUpdateCache(Object key,Object value){
        //包含则判断该值是否改变，改变了则插入
        if(!cacheMap.containsKey(key)){
            cacheMap.put(key,value);
            return true;
        }else{
            //更新值
            if(!cacheMap.contains(value) && cacheMap.containsKey(key)){
                cacheMap.put(key,value);
                return true;
            }
        }
        return false;
    }

    /**
     * 删除缓存
     * @param key
     * @return
     */
    public boolean deleteCache(Object key){
        if(cacheMap.containsKey(key)){
            cacheMap.remove(key);
            return true;
        }
        return false;
    }

    public Object selectCache(Object key){
         boolean flag = cacheMap.containsKey(key);
        if(flag){
            return cacheMap.get(key);
        }
        return null;
    }
}
