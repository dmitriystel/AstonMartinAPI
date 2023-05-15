package com.runmylease.astonmartinsummitapi.constants;

public class Endpoints {
    // default
    public static final String APP_HEALTH = "/app/health";
    public static final String APP_PERMISSIONS = "/app/permissions";
    public static final String CMS_CONFIG = "/cms/config";
    public static final String SERVICE_API_SITES = "/service-api/sites";
    public static final String THIRD_PARTY_IODSTREAM = "/third-party/iodstream";
    
    // Site Builder    

    // Sites
    public static final String CMS_SITES = "/cms/sites";
    public static final String CMS_SITES_CONFIGS = "/cms/siteConfigs";
    public static final String CMS_SITES_CONFIGS_SITE_CONFIG_ID = "/cms/siteConfigs/{siteConfigId}";
    public static final String CMS_SITES_NEW = "/cms/sites/new";
    public static final String CMS_SITES_SITE_ID = "/cms/sites/{siteId}";
    public static final String CMS_SITES_CONFIGS_SITE_SITE_CONFIG_ID_RELEASE = "/cms/siteConfigs/{siteConfigId}/release";
    public static final String CMS_SITES_CONFIGS_SITE_SITE_CONFIG_ID_RESTORE = "/cms/siteConfigs/{siteConfigId}/restore";
    public static final String CMS_SITES_SITE_SITE_ID_EXPORT = "/cms/sites/{siteId}/export";
    public static final String CMS_SITES_IMPORT = "/cms/sites/import";
    public static final String CMS_SITES_SITE_ID_MAPPINGS = "/cms/sites/{siteId}/mappings";
    public static final String CMS_SITES_CONFIGS_SITE_CONFIG_ID_CHECK = "/cms/siteConfigs/{siteConfigId}/check";

}
