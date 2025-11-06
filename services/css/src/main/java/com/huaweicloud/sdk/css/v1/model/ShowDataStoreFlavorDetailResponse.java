package com.huaweicloud.sdk.css.v1.model;

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
public class ShowDataStoreFlavorDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbname")

    private String dbname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<FlavorRespVersionBody> versions = null;

    public ShowDataStoreFlavorDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 引擎类型id。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDataStoreFlavorDetailResponse withDbname(String dbname) {
        this.dbname = dbname;
        return this;
    }

    /**
     * **参数解释**： 引擎名称。 **取值范围**： 不涉及
     * @return dbname
     */
    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public ShowDataStoreFlavorDetailResponse withVersions(List<FlavorRespVersionBody> versions) {
        this.versions = versions;
        return this;
    }

    public ShowDataStoreFlavorDetailResponse addVersionsItem(FlavorRespVersionBody versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ShowDataStoreFlavorDetailResponse withVersions(Consumer<List<FlavorRespVersionBody>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * **参数解释**： 引擎版本。 **取值范围**： 不涉及
     * @return versions
     */
    public List<FlavorRespVersionBody> getVersions() {
        return versions;
    }

    public void setVersions(List<FlavorRespVersionBody> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataStoreFlavorDetailResponse that = (ShowDataStoreFlavorDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dbname, that.dbname)
            && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dbname, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataStoreFlavorDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
