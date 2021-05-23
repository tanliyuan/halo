/**
 * Copyright (C), 2011-2021.
 */
package run.halo.app.utils;

import com.google.common.collect.Maps;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author tanliyuan 2021/5/23 - 5:36 下午.
 */
public class FunctionUtil {

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentMap<Object, Boolean> seen = Maps.newConcurrentMap();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
