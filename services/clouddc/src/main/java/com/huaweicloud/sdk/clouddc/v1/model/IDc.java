package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDc
 */
public class IDc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "irack_num")

    private Integer irackNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deccription")

    private String deccription;

    public IDc withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDc withIrackNum(Integer irackNum) {
        this.irackNum = irackNum;
        return this;
    }

    /**
     * Get irackNum
     * @return irackNum
     */
    public Integer getIrackNum() {
        return irackNum;
    }

    public void setIrackNum(Integer irackNum) {
        this.irackNum = irackNum;
    }

    public IDc withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IDc withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public IDc withDeccription(String deccription) {
        this.deccription = deccription;
        return this;
    }

    /**
     * Get deccription
     * @return deccription
     */
    public String getDeccription() {
        return deccription;
    }

    public void setDeccription(String deccription) {
        this.deccription = deccription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDc that = (IDc) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.irackNum, that.irackNum)
            && Objects.equals(this.id, that.id) && Objects.equals(this.region, that.region)
            && Objects.equals(this.deccription, that.deccription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, irackNum, id, region, deccription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDc {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    irackNum: ").append(toIndentedString(irackNum)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    deccription: ").append(toIndentedString(deccription)).append("\n");
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
