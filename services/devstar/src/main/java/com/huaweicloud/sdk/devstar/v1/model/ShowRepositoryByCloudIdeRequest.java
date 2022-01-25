package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowRepositoryByCloudIdeRequest {

    /** 语言类型 中文:zh-cn 英文:en-us */
    public static final class XLanguageEnum {

        /** Enum ZH_CN for value: "zh-cn" */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /** Enum EN_US for value: "en-us" */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_ssh_url")

    private String repositorySshUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_prefix")

    private String spacePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open_last")

    private Boolean isOpenLast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_free")

    private Boolean isFree;

    public ShowRepositoryByCloudIdeRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /** 语言类型 中文:zh-cn 英文:en-us
     * 
     * @return xLanguage */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowRepositoryByCloudIdeRequest withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /** 仓库id
     * 
     * @return repositoryId */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowRepositoryByCloudIdeRequest withRepositorySshUrl(String repositorySshUrl) {
        this.repositorySshUrl = repositorySshUrl;
        return this;
    }

    /** 仓库下载地址
     * 
     * @return repositorySshUrl */
    public String getRepositorySshUrl() {
        return repositorySshUrl;
    }

    public void setRepositorySshUrl(String repositorySshUrl) {
        this.repositorySshUrl = repositorySshUrl;
    }

    public ShowRepositoryByCloudIdeRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 区域ID
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowRepositoryByCloudIdeRequest withSpacePrefix(String spacePrefix) {
        this.spacePrefix = spacePrefix;
        return this;
    }

    /** 工作空间名称前缀
     * 
     * @return spacePrefix */
    public String getSpacePrefix() {
        return spacePrefix;
    }

    public void setSpacePrefix(String spacePrefix) {
        this.spacePrefix = spacePrefix;
    }

    public ShowRepositoryByCloudIdeRequest withIsOpenLast(Boolean isOpenLast) {
        this.isOpenLast = isOpenLast;
        return this;
    }

    /** 是否打开上一次的工作空间
     * 
     * @return isOpenLast */
    public Boolean getIsOpenLast() {
        return isOpenLast;
    }

    public void setIsOpenLast(Boolean isOpenLast) {
        this.isOpenLast = isOpenLast;
    }

    public ShowRepositoryByCloudIdeRequest withIsFree(Boolean isFree) {
        this.isFree = isFree;
        return this;
    }

    /** 是否创建免费实例链接
     * 
     * @return isFree */
    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRepositoryByCloudIdeRequest showRepositoryByCloudIdeRequest = (ShowRepositoryByCloudIdeRequest) o;
        return Objects.equals(this.xLanguage, showRepositoryByCloudIdeRequest.xLanguage)
            && Objects.equals(this.repositoryId, showRepositoryByCloudIdeRequest.repositoryId)
            && Objects.equals(this.repositorySshUrl, showRepositoryByCloudIdeRequest.repositorySshUrl)
            && Objects.equals(this.regionId, showRepositoryByCloudIdeRequest.regionId)
            && Objects.equals(this.spacePrefix, showRepositoryByCloudIdeRequest.spacePrefix)
            && Objects.equals(this.isOpenLast, showRepositoryByCloudIdeRequest.isOpenLast)
            && Objects.equals(this.isFree, showRepositoryByCloudIdeRequest.isFree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, repositoryId, repositorySshUrl, regionId, spacePrefix, isOpenLast, isFree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryByCloudIdeRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositorySshUrl: ").append(toIndentedString(repositorySshUrl)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    spacePrefix: ").append(toIndentedString(spacePrefix)).append("\n");
        sb.append("    isOpenLast: ").append(toIndentedString(isOpenLast)).append("\n");
        sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
