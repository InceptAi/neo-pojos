package com.inceptai.neopojos;

import java.util.List;

@SuppressWarnings("unused")
public class ElementIdentifier {
    private String className;
    private String packageName;
    private List<String> keywordList;

    public ElementIdentifier(String className, String packageName, List<String> keywordList) {
        this.className = className;
        this.packageName = packageName;
        this.keywordList = keywordList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<String> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<String> keywordList) {
        this.keywordList = keywordList;
    }
}
