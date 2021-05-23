/**
 * Copyright (C), 2011-2021.
 */
package run.halo.app.utils;

/**
 * @author tanliyuan 2021/5/23 - 11:27 上午.
 */
public class AvatarGeneratorUtil {
    public static final String avatar_service = "https://ui-avatars.com/api/?background=0D8ABC&color=fff&name=%s";

    public static String generateAvatar(String emailAddress) {
        return String.format(avatar_service, emailAddress);
    }
}
