package com.jeasywebframework.domain.dept;

import com.jeasywebframework.domain.BaseAudit;

import java.io.Serializable;

/**
 * Created by jeasywebframework@gmail.com on 13-12-18.
 */
public class Resource extends BaseAudit implements Serializable {

    public static final String PATH = "path";

    private Long id;

    private String name;

    private String code;

    private String type;

    private String descp;

    private String url;

    private String method;

    private String javaMethod;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;


    private Long oorder;

    // =========================

    private Long parentId;

    private String path;

    private Long childrenNum;

    private Integer level;

    // =========================

    // ========================================================================================
    // ========================================================================================
    // ========================================================================================


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getJavaMethod() {
        return javaMethod;
    }

    public void setJavaMethod(String javaMethod) {
        this.javaMethod = javaMethod;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public Long getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(Long childrenNum) {
        this.childrenNum = childrenNum;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getOorder() {
        return oorder;
    }

    public void setOorder(Long oorder) {
        this.oorder = oorder;
    }
}
