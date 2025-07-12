package com.app.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AccountHolder implements InitializingBean, DisposableBean {

    private String acHolderName;

    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    @Override
    public String toString() {
        return "AccountHolder [acHolderName=" + acHolderName + "]";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AC destroy method is invoked ");
        acHolderName = null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ac init method invoked");
        if (acHolderName == null) {
            throw new IllegalArgumentException("acHolderName can't be null");
        }
    }

}
