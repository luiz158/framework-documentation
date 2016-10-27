/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demoiselle.jee.core.api.security;

import java.security.Principal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 70744416353
 */
public interface DemoisellePrincipal extends Principal {

    /**
     * @return Identity user
     */
    public String getIdentity();

    /**
     * @param id Identity user
     */
    public void setIdentity(String id);

    /**
     * @param name Principal name
     */
    public void setName(String name);

    /**
     * @param roles Principal roles
     */
    public void setRoles(List<String> roles);

    /**
     * @param role Role name
     */
    public void addRole(String role);

    /**
     * @param role Role name
     */
    public void removeRole(String role);

    /**
     * @return List of roles
     */
    public List<String> getRoles();

    /**
     *
     * @return List of permissions
     */
    public Map<String, List<String>> getPermissions();

    /**
     * @param resource Resource name
     * @return List of permissions
     */
    public List<String> getPermissions(String resource);

    /**
     *
     * @param resource Resource name
     * @param operation Operation name
     */
    public void addPermission(String resource, String operation);

    /**
     *
     * @param resource Resource name
     * @param operation Operation name
     */
    public void removePermission(String resource, String operation);

    /**
     *
     * @param permissions Permissions
     */
    public void setPermissions(Map<String, List<String>> permissions);

    /**
     *
     * @return Params
     */
    public Map<String, List<String>> getParams();

    /**
     *
     * @param key Key parameter
     * @return List of parameter
     */
    public List<String> getParams(String key);

    /**
     *
     * @param key Key parameter
     * @param value Value parameter
     */
    public void addParam(String key, String value);

    /**
     *
     * @param key Key parameter
     * @param value Value parameter
     */
    public void removeParam(String key, String value);

    /**
     *
     * @param params Params
     */
    public void setParams(Map<String, List<String>> params);

    /**
     *
     * @return Principal clone
     */
    public DemoisellePrincipal clone();
}