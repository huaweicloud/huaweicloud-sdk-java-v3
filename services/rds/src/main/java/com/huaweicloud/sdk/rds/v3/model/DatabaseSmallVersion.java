package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 版本信息对象
 */
public class DatabaseSmallVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favored")

    private Boolean favored;

    public DatabaseSmallVersion withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释： 数据库版本ID，该字段不会有重复。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseSmallVersion withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释： 数据库版本号。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseSmallVersion withFavored(Boolean favored) {
        this.favored = favored;
        return this;
    }

    /**
     * 参数解释： 是否优选版本。
     * @return favored
     */
    public Boolean getFavored() {
        return favored;
    }

    public void setFavored(Boolean favored) {
        this.favored = favored;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseSmallVersion that = (DatabaseSmallVersion) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.favored, that.favored);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, favored);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseSmallVersion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    favored: ").append(toIndentedString(favored)).append("\n");
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
