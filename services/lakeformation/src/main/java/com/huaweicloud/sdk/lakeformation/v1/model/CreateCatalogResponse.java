package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCatalogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_location_list")

    private List<String> databaseLocationList = null;

    public CreateCatalogResponse withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public CreateCatalogResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCatalogResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 路径地址
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CreateCatalogResponse withDatabaseLocationList(List<String> databaseLocationList) {
        this.databaseLocationList = databaseLocationList;
        return this;
    }

    public CreateCatalogResponse addDatabaseLocationListItem(String databaseLocationListItem) {
        if (this.databaseLocationList == null) {
            this.databaseLocationList = new ArrayList<>();
        }
        this.databaseLocationList.add(databaseLocationListItem);
        return this;
    }

    public CreateCatalogResponse withDatabaseLocationList(Consumer<List<String>> databaseLocationListSetter) {
        if (this.databaseLocationList == null) {
            this.databaseLocationList = new ArrayList<>();
        }
        databaseLocationListSetter.accept(this.databaseLocationList);
        return this;
    }

    /**
     * database路径列表
     * @return databaseLocationList
     */
    public List<String> getDatabaseLocationList() {
        return databaseLocationList;
    }

    public void setDatabaseLocationList(List<String> databaseLocationList) {
        this.databaseLocationList = databaseLocationList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCatalogResponse createCatalogResponse = (CreateCatalogResponse) o;
        return Objects.equals(this.catalogName, createCatalogResponse.catalogName)
            && Objects.equals(this.description, createCatalogResponse.description)
            && Objects.equals(this.location, createCatalogResponse.location)
            && Objects.equals(this.databaseLocationList, createCatalogResponse.databaseLocationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName, description, location, databaseLocationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCatalogResponse {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    databaseLocationList: ").append(toIndentedString(databaseLocationList)).append("\n");
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
