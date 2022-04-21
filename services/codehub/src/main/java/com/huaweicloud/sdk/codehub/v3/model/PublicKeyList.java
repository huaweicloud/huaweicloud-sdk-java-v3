package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PublicKeyList
 */
public class PublicKeyList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sshkey")

    private List<PublicKey> sshkey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public PublicKeyList withSshkey(List<PublicKey> sshkey) {
        this.sshkey = sshkey;
        return this;
    }

    public PublicKeyList addSshkeyItem(PublicKey sshkeyItem) {
        if (this.sshkey == null) {
            this.sshkey = new ArrayList<>();
        }
        this.sshkey.add(sshkeyItem);
        return this;
    }

    public PublicKeyList withSshkey(Consumer<List<PublicKey>> sshkeySetter) {
        if (this.sshkey == null) {
            this.sshkey = new ArrayList<>();
        }
        sshkeySetter.accept(this.sshkey);
        return this;
    }

    /**
     * 密钥列表
     * @return sshkey
     */
    public List<PublicKey> getSshkey() {
        return sshkey;
    }

    public void setSshkey(List<PublicKey> sshkey) {
        this.sshkey = sshkey;
    }

    public PublicKeyList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 密钥总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicKeyList publicKeyList = (PublicKeyList) o;
        return Objects.equals(this.sshkey, publicKeyList.sshkey) && Objects.equals(this.total, publicKeyList.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshkey, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicKeyList {\n");
        sb.append("    sshkey: ").append(toIndentedString(sshkey)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
