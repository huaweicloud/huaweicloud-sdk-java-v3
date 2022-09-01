package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelInfoV2
 */
public class ChannelInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_names")

    @JacksonXmlProperty(localName = "org_names")

    private List<String> orgNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public ChannelInfoV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 通道名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelInfoV2 withOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
        return this;
    }

    public ChannelInfoV2 addOrgNamesItem(String orgNamesItem) {
        if (this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        this.orgNames.add(orgNamesItem);
        return this;
    }

    public ChannelInfoV2 withOrgNames(Consumer<List<String>> orgNamesSetter) {
        if (this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        orgNamesSetter.accept(this.orgNames);
        return this;
    }

    /**
     * 通道中组织名
     * @return orgNames
     */
    public List<String> getOrgNames() {
        return orgNames;
    }

    public void setOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
    }

    public ChannelInfoV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 通道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelInfoV2 channelInfoV2 = (ChannelInfoV2) o;
        return Objects.equals(this.name, channelInfoV2.name) && Objects.equals(this.orgNames, channelInfoV2.orgNames)
            && Objects.equals(this.description, channelInfoV2.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orgNames, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelInfoV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgNames: ").append(toIndentedString(orgNames)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
