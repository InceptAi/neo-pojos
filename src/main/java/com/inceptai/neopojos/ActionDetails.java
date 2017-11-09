package com.inceptai.neopojos;

import java.util.List;

@SuppressWarnings("unused")
public class ActionDetails {
    private Condition successCondition;
    private List<NavigationIdentifier> navigationIdentifierList;
    private ActionIdentifier actionIdentifier;

    public ActionDetails(Condition successCondition,
                         List<NavigationIdentifier> navigationIdentifierList,
                         ActionIdentifier actionIdentifier) {
        this.successCondition = successCondition;
        this.navigationIdentifierList = navigationIdentifierList;
        this.actionIdentifier = actionIdentifier;
    }

    public Condition getSuccessCondition() {
        return successCondition;
    }

    public void setSuccessCondition(Condition successCondition) {
        this.successCondition = successCondition;
    }

    public List<NavigationIdentifier> getNavigationIdentifierList() {
        return navigationIdentifierList;
    }

    public void setNavigationIdentifierList(List<NavigationIdentifier> navigationIdentifierList) {
        this.navigationIdentifierList = navigationIdentifierList;
    }

    public ActionIdentifier getActionIdentifier() {
        return actionIdentifier;
    }

    public void setActionIdentifier(ActionIdentifier actionIdentifier) {
        this.actionIdentifier = actionIdentifier;
    }
}