package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class Offline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_url")

    @JacksonXmlProperty(localName = "user_url")

    private String userUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_url")

    @JacksonXmlProperty(localName = "item_url")

    private String itemUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_url")

    @JacksonXmlProperty(localName = "behavior_url")

    private String behaviorUrl;

    public Offline withUserUrl(String userUrl) {
        this.userUrl = userUrl;
        return this;
    }

    /**
     * 用户数据url。
     * @return userUrl
     */
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Offline withItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }

    /**
     * 物品数据url。
     * @return itemUrl
     */
    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public Offline withBehaviorUrl(String behaviorUrl) {
        this.behaviorUrl = behaviorUrl;
        return this;
    }

    /**
     * 行为数据url。
     * @return behaviorUrl
     */
    public String getBehaviorUrl() {
        return behaviorUrl;
    }

    public void setBehaviorUrl(String behaviorUrl) {
        this.behaviorUrl = behaviorUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Offline offline = (Offline) o;
        return Objects.equals(this.userUrl, offline.userUrl) && Objects.equals(this.itemUrl, offline.itemUrl)
            && Objects.equals(this.behaviorUrl, offline.behaviorUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUrl, itemUrl, behaviorUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Offline {\n");
        sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
        sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
        sb.append("    behaviorUrl: ").append(toIndentedString(behaviorUrl)).append("\n");
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
