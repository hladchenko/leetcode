/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".
    https://leetcode.com/problems/defanging-an-ip-address/
 */

package com.hladchenko.leetcode.easy;

public class Task1108 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
