package com.inceptai.neopojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unused")
public class CrawlingInput {
    public static final String FULL_SCREEN_MODE = "FULL";
    public static final String PARTIAL_SCREEN_MODE = "PARTIAL";
    public static final String UNDEFINED_SCREEN_MODE = "UNDEFINED";
    private int numViews;
    private String rootSubTitle = Utils.EMPTY_STRING;
    private String lastScreenSubTitle = Utils.EMPTY_STRING;
    private String currentScreenType = Utils.EMPTY_STRING;
    private String lastScreenType = Utils.EMPTY_STRING;
    private String rootTitle = Utils.EMPTY_STRING;
    private String lastScreenTitle = Utils.EMPTY_STRING;
    private String lastScreenPackageName = Utils.EMPTY_STRING;
    private String rootPackageName = Utils.EMPTY_STRING;
    private String lastUIAction = Utils.EMPTY_STRING;
    private String appVersion = Utils.EMPTY_STRING;
    private String versionCode = Utils.EMPTY_STRING;
    private int rootHeight;
    private int rootWidth;
    private RenderingView lastViewClicked;
    private DeviceInfo deviceInfo = new DeviceInfo();
    private HashMap<String, RenderingView> viewMap = new HashMap<>() ;

    public CrawlingInput() {}

    public CrawlingInput(int numViews, int rootHeight, int rootWidth, String rootTitle,
                         String lastScreenTitle, String lastScreenPackageName,
                         RenderingView lastViewClicked, String lastUIAction,
                         String rootPackageName, DeviceInfo deviceInfo,
                         HashMap<String, RenderingView> viewMap, String appVersion,
                         String versionCode) {
        this.numViews = numViews;
        this.rootHeight = rootHeight;
        this.rootWidth = rootWidth;
        this.rootTitle = rootTitle;
        this.lastScreenTitle = lastScreenTitle;
        this.lastViewClicked = lastViewClicked;
        this.lastUIAction = lastUIAction;
        this.lastScreenPackageName = lastScreenPackageName;
        this.rootPackageName = rootPackageName;
        this.deviceInfo = deviceInfo;
        this.viewMap = viewMap;
        this.appVersion = appVersion;
        this.versionCode = versionCode;
    }

    public CrawlingInput(int rootWidth, int rootHeight, DeviceInfo deviceInfo) {
        numViews = 0;
        this.rootWidth = rootWidth;
        this.rootHeight = rootHeight;
        this.rootTitle = Utils.EMPTY_STRING;
        this.lastScreenTitle = Utils.EMPTY_STRING;
        this.lastViewClicked = null;
        this.lastUIAction = Utils.EMPTY_STRING;
        this.lastScreenPackageName = Utils.EMPTY_STRING;
        this.rootPackageName = Utils.EMPTY_STRING;
        this.deviceInfo = deviceInfo;
        this.lastScreenType = UNDEFINED_SCREEN_MODE;
        this.rootSubTitle = Utils.EMPTY_STRING;
        this.lastScreenSubTitle = Utils.EMPTY_STRING;
        this.appVersion = Utils.EMPTY_STRING;
        this.versionCode = Utils.EMPTY_STRING;
    }

    public void addView(String viewId, RenderingView renderingView) {
        viewMap.put(viewId, renderingView);
        numViews ++;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getRootSubTitle() {
        return rootSubTitle;
    }

    public String getLastScreenSubTitle() {
        return lastScreenSubTitle;
    }

    public String getCurrentScreenType() {
        return currentScreenType;
    }

    public String getLastScreenType() {
        return lastScreenType;
    }

    public String getRootPackageName() {
        return rootPackageName;
    }

    public String getRootTitle() {
        return Utils.sanitizeText(rootTitle);
    }

    public int getNumViews() {
        return numViews;
    }

    public int getRootHeight() {
        return rootHeight;
    }

    public int getRootWidth() {
        return rootWidth;
    }

    public HashMap<String, RenderingView> getViewMap() {
        return viewMap;
    }

    public List<RenderingView> getRenderingViewList() {
        return new ArrayList<RenderingView>(viewMap.values());
    }

    public boolean isEmpty() {
        return viewMap.isEmpty();
    }

    public String getParentViewId(String viewId) {
        if (viewMap.get(viewId) != null) {
            return viewMap.get(viewId).getParentViewId();
        }
        return Utils.EMPTY_STRING;
    }

    public String getLastScreenPackageName() {
        return lastScreenPackageName;
    }

    public RenderingView getLastViewClicked() {
        return lastViewClicked;
    }

    public String getLastUIAction() {
        return Utils.sanitizeText(lastUIAction);
    }

    public String getLastScreenTitle() {
        return Utils.sanitizeText(lastScreenTitle);
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setNumViews(int numViews) {
        this.numViews = numViews;
    }

    public void setRootSubTitle(String rootSubTitle) {
        this.rootSubTitle = rootSubTitle;
    }

    public void setLastScreenSubTitle(String lastScreenSubTitle) {
        this.lastScreenSubTitle = lastScreenSubTitle;
    }

    public void setCurrentScreenType(String currentScreenType) {
        this.currentScreenType = currentScreenType;
    }

    public void setLastScreenType(String lastScreenType) {
        this.lastScreenType = lastScreenType;
    }

    public void setRootTitle(String rootTitle) {
        this.rootTitle = rootTitle;
    }

    public void setLastScreenTitle(String lastScreenTitle) {
        this.lastScreenTitle = lastScreenTitle;
    }

    public void setLastScreenPackageName(String lastScreenPackageName) {
        this.lastScreenPackageName = lastScreenPackageName;
    }

    public void setRootPackageName(String rootPackageName) {
        this.rootPackageName = rootPackageName;
    }

    public void setLastUIAction(String lastUIAction) {
        this.lastUIAction = lastUIAction;
    }

    public void setRootHeight(int rootHeight) {
        this.rootHeight = rootHeight;
    }

    public void setRootWidth(int rootWidth) {
        this.rootWidth = rootWidth;
    }

    public void setLastViewClicked(RenderingView lastViewClicked) {
        this.lastViewClicked = lastViewClicked;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public void setViewMap(HashMap<String, RenderingView> viewMap) {
        this.viewMap = viewMap;
    }

    @Override
    public String toString() {
        return "CrawlingInput{" +
                "numViews=" + numViews +
                ", rootSubTitle='" + rootSubTitle + '\'' +
                ", lastScreenSubTitle='" + lastScreenSubTitle + '\'' +
                ", currentScreenType='" + currentScreenType + '\'' +
                ", lastScreenType='" + lastScreenType + '\'' +
                ", rootHeight=" + rootHeight +
                ", rootWidth=" + rootWidth +
                ", rootTitle='" + rootTitle + '\'' +
                ", lastScreenTitle='" + lastScreenTitle + '\'' +
                ", lastScreenPackageName='" + lastScreenPackageName + '\'' +
                ", lastViewClicked=" + lastViewClicked +
                ", rootPackageName='" + rootPackageName + '\'' +
                ", lastUIAction='" + lastUIAction + '\'' +
                '}';
    }
}
