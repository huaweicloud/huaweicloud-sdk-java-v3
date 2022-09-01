package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class SqlserverDatabaseForDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_set")

    @JacksonXmlProperty(localName = "character_set")

    private String characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    public SqlserverDatabaseForDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlserverDatabaseForDetail withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * 数据库使用的字符集，例如Chinese_PRC_CI_AS等。
     * @return characterSet
     */
    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public SqlserverDatabaseForDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 数据库状态。取值如下:  Creating:表示创建中。 Running:表示使用中。 Deleting:表示删除中。 NotExists:表示不存在。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlserverDatabaseForDetail sqlserverDatabaseForDetail = (SqlserverDatabaseForDetail) o;
        return Objects.equals(this.name, sqlserverDatabaseForDetail.name)
            && Objects.equals(this.characterSet, sqlserverDatabaseForDetail.characterSet)
            && Objects.equals(this.state, sqlserverDatabaseForDetail.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characterSet, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlserverDatabaseForDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
