package org.amos.ioc.overview.repository;

import org.amos.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;

import java.util.Collection;

public class UserRepository {
    private Collection<User> users;//自定义



    private BeanFactory beanFactory;//内建非 Bean对象（依赖）

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
}
