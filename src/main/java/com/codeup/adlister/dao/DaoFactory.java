package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
    private static Users getUsers;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }


}
