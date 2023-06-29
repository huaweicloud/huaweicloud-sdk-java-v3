package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点绑定加密数据配置
 */
public class EncryptDataNodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_datas")

    private List<String> encryptDatas = null;

    public EncryptDataNodeReq withEncryptDatas(List<String> encryptDatas) {
        this.encryptDatas = encryptDatas;
        return this;
    }

    public EncryptDataNodeReq addEncryptDatasItem(String encryptDatasItem) {
        if (this.encryptDatas == null) {
            this.encryptDatas = new ArrayList<>();
        }
        this.encryptDatas.add(encryptDatasItem);
        return this;
    }

    public EncryptDataNodeReq withEncryptDatas(Consumer<List<String>> encryptDatasSetter) {
        if (this.encryptDatas == null) {
            this.encryptDatas = new ArrayList<>();
        }
        encryptDatasSetter.accept(this.encryptDatas);
        return this;
    }

    /**
     * 加密数据ID列表
     * @return encryptDatas
     */
    public List<String> getEncryptDatas() {
        return encryptDatas;
    }

    public void setEncryptDatas(List<String> encryptDatas) {
        this.encryptDatas = encryptDatas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDataNodeReq that = (EncryptDataNodeReq) obj;
        return Objects.equals(this.encryptDatas, that.encryptDatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptDatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDataNodeReq {\n");
        sb.append("    encryptDatas: ").append(toIndentedString(encryptDatas)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
