package org.amos.ioc.overview.repository;

import org.amos.ioc.overview.domain.User;

import java.util.Collection;

public class UserRepository {
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
