package org.amos.ioc.overview.domain;

/**
 * Date: 2020/3/7 18:19
 *
 * @author: amos
 * Description:
 */


public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
