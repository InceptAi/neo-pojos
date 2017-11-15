package com.inceptai.neopojos;

@SuppressWarnings("unused")
public class RenderingView {
    private String parentViewId;
    private String flatViewId;
    private String packageName;
    private String className;
    private String text;
    private String contentDescription;
    private String viewIdResourceName;
    private int leftX;
    private int rightX;
    private int topY;
    private int bottomY;
    //Important that for boolean getters --- setIsParentOfClickableView -- Is needs to be there.
    private boolean isParentOfClickableView;
    private boolean isChecked;
    private boolean isClickable;
    private boolean isCheckable;
    private boolean isScrollable = false;
    private boolean isEnabled = false;
    private boolean isSelected = false;
    private int totalItems = 0;
    private int currentItemIndex = 0;
    private int startItemIndex = 0;
    private int endItemIndex = 0;

    public boolean isScrollable() {
        return isScrollable;
    }

    public void setIsScrollable(boolean scrollable) {
        isScrollable = scrollable;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getCurrentItemIndex() {
        return currentItemIndex;
    }

    public void setCurrentItemIndex(int currentItemIndex) {
        this.currentItemIndex = currentItemIndex;
    }

    public int getStartItemIndex() {
        return startItemIndex;
    }

    public void setStartItemIndex(int startItemIndex) {
        this.startItemIndex = startItemIndex;
    }

    public int getEndItemIndex() {
        return endItemIndex;
    }

    public void setEndItemIndex(int endItemIndex) {
        this.endItemIndex = endItemIndex;
    }

    public String getParentViewId() {
        return parentViewId;
    }

    public String getFlatViewId() {
        return flatViewId;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getText() {
        return Utils.sanitizeText(text);
    }

    public String getContentDescription() {
        return Utils.sanitizeText(contentDescription);
    }

    public String getViewIdResourceName() {
        return viewIdResourceName;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getRightX() {
        return rightX;
    }

    public int getTopY() {
        return topY;
    }

    public int getBottomY() {
        return bottomY;
    }

    public boolean isParentOfClickableView() {
        return isParentOfClickableView;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public boolean isClickable() {
        return isClickable;
    }

    public boolean isCheckable() {
        return isCheckable;
    }

    public void setParentViewId(String parentViewId) {
        this.parentViewId = parentViewId;
    }

    public void setFlatViewId(String flatViewId) {
        this.flatViewId = flatViewId;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public void setViewIdResourceName(String viewIdResourceName) {
        this.viewIdResourceName = viewIdResourceName;
    }

    public void setLeftX(int leftX) {
        this.leftX = leftX;
    }

    public void setRightX(int rightX) {
        this.rightX = rightX;
    }

    public void setTopY(int topY) {
        this.topY = topY;
    }

    public void setBottomY(int bottomY) {
        this.bottomY = bottomY;
    }

    public void setIsParentOfClickableView(boolean parentOfClickableView) {
        isParentOfClickableView = parentOfClickableView;
    }

    public void setIsChecked(boolean checked) {
        isChecked = checked;
    }

    public void setIsClickable(boolean clickable) {
        isClickable = clickable;
    }

    public void setIsCheckable(boolean checkable) {
        isCheckable = checkable;
    }

    //Empty constructor
    public RenderingView(){}

    //Actual constructor
    public RenderingView(String parentViewId,  String flatViewId, String packageName,
                         String className, String contentDescription, String text,
                         String viewIdResourceName, int leftX, int rightX, int topY,
                         int bottomY, boolean isParentOfClickableView, boolean isChecked,
                         boolean isClickable, boolean isCheckable, boolean isScrollable,
                         boolean isSelected) {
        this.flatViewId = flatViewId;
        this.viewIdResourceName = viewIdResourceName;
        this.className = className;
        this.packageName = packageName;
        this.text = text;
        this.parentViewId = parentViewId;
        this.contentDescription = contentDescription;
        this.isClickable = isClickable;
        this.isCheckable = isCheckable;
        this.isChecked = isChecked;
        this.topY = topY;
        this.bottomY = bottomY;
        this.leftX = leftX;
        this.rightX = rightX;
        this.isParentOfClickableView = isParentOfClickableView;
        this.isScrollable = isScrollable;
        this.isSelected = isSelected;
    }

    public RenderingView(String className,
                         String packageName,
                         String contentDescription,
                         String text) {
        this.viewIdResourceName = Utils.EMPTY_STRING;
        this.className = className;
        this.packageName = packageName;
        this.text = text;
        this.contentDescription = contentDescription;
        this.currentItemIndex = -1;
        this.endItemIndex = -1;
        this.startItemIndex = -1;
        this.totalItems = 0;
    }

    public RenderingView(String className,
                         String packageName,
                         String contentDescription,
                         String text,
                         boolean isClickable,
                         boolean isCheckable,
                         boolean isScrollable,
                         boolean isChecked,
                         boolean isEnabled,
                         boolean isSelected,
                         int totalItems,
                         int currentItemIndex,
                         int startItemIndex,
                         int endItemIndex) {
        this.viewIdResourceName = Utils.EMPTY_STRING;
        this.className = className;
        this.packageName = packageName;
        this.text = text;
        this.contentDescription = contentDescription;
        this.isClickable = isClickable;
        this.isCheckable = isCheckable;
        this.isScrollable = isScrollable;
        this.isChecked = isChecked;
        this.isEnabled = isEnabled;
        this.isSelected = isSelected;
        this.totalItems = totalItems;
        this.currentItemIndex = currentItemIndex;
        this.startItemIndex = startItemIndex;
        this.endItemIndex = endItemIndex;
    }

    public String getOverallText() {
        String textToReturn = Utils.EMPTY_STRING;
        String NULL_TEXT = "null";
        if (!text.equals(NULL_TEXT)) {
            textToReturn = text;
        } else if (!contentDescription.equals(NULL_TEXT)) {
            textToReturn = contentDescription;
        }
        return Utils.sanitizeText(textToReturn);
    }
}

