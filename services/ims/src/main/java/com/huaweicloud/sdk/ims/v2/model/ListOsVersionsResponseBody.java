package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.OsVersionInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 查询操作系统列表响应体
 */
public class ListOsVersionsResponseBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_list")
    
    private List<OsVersionInfo> versionList = new ArrayList<>();
    
    public ListOsVersionsResponseBody withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 操作系统的平台值，如RedHat等
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ListOsVersionsResponseBody withVersionList(List<OsVersionInfo> versionList) {
        this.versionList = versionList;
        return this;
    }

    
    public ListOsVersionsResponseBody addVersionListItem(OsVersionInfo versionListItem) {
        this.versionList.add(versionListItem);
        return this;
    }

    public ListOsVersionsResponseBody withVersionList(Consumer<List<OsVersionInfo>> versionListSetter) {
        if(this.versionList == null ){
            this.versionList = new ArrayList<>();
        }
        versionListSetter.accept(this.versionList);
        return this;
    }

    /**
     * 操作系统的详情值
     * @return versionList
     */
    public List<OsVersionInfo> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<OsVersionInfo> versionList) {
        this.versionList = versionList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOsVersionsResponseBody listOsVersionsResponseBody = (ListOsVersionsResponseBody) o;
        return Objects.equals(this.platform, listOsVersionsResponseBody.platform) &&
            Objects.equals(this.versionList, listOsVersionsResponseBody.versionList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(platform, versionList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOsVersionsResponseBody {\n");
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
            sb.append("    versionList: ").append(toIndentedString(versionList)).append("\n");
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

