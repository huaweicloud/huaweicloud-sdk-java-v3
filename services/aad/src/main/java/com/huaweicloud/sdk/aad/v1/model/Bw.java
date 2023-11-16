package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 黑白名单详情
 */
public class Bw {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_ip_list")

    private List<String> blackIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_ip_list")

    private List<String> whiteIpList = null;

    public Bw withBlackIpList(List<String> blackIpList) {
        this.blackIpList = blackIpList;
        return this;
    }

    public Bw addBlackIpListItem(String blackIpListItem) {
        if (this.blackIpList == null) {
            this.blackIpList = new ArrayList<>();
        }
        this.blackIpList.add(blackIpListItem);
        return this;
    }

    public Bw withBlackIpList(Consumer<List<String>> blackIpListSetter) {
        if (this.blackIpList == null) {
            this.blackIpList = new ArrayList<>();
        }
        blackIpListSetter.accept(this.blackIpList);
        return this;
    }

    /**
     * 黑名单列表
     * @return blackIpList
     */
    public List<String> getBlackIpList() {
        return blackIpList;
    }

    public void setBlackIpList(List<String> blackIpList) {
        this.blackIpList = blackIpList;
    }

    public Bw withWhiteIpList(List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }

    public Bw addWhiteIpListItem(String whiteIpListItem) {
        if (this.whiteIpList == null) {
            this.whiteIpList = new ArrayList<>();
        }
        this.whiteIpList.add(whiteIpListItem);
        return this;
    }

    public Bw withWhiteIpList(Consumer<List<String>> whiteIpListSetter) {
        if (this.whiteIpList == null) {
            this.whiteIpList = new ArrayList<>();
        }
        whiteIpListSetter.accept(this.whiteIpList);
        return this;
    }

    /**
     * 白名单列表
     * @return whiteIpList
     */
    public List<String> getWhiteIpList() {
        return whiteIpList;
    }

    public void setWhiteIpList(List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bw that = (Bw) obj;
        return Objects.equals(this.blackIpList, that.blackIpList) && Objects.equals(this.whiteIpList, that.whiteIpList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackIpList, whiteIpList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bw {\n");
        sb.append("    blackIpList: ").append(toIndentedString(blackIpList)).append("\n");
        sb.append("    whiteIpList: ").append(toIndentedString(whiteIpList)).append("\n");
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
