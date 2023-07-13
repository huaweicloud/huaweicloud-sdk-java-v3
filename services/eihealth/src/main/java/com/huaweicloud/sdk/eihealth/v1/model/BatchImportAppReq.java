package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入应用请求体
 */
public class BatchImportAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_apps")

    private List<AppSrcReq> importApps = null;

    public BatchImportAppReq withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public BatchImportAppReq withImportApps(List<AppSrcReq> importApps) {
        this.importApps = importApps;
        return this;
    }

    public BatchImportAppReq addImportAppsItem(AppSrcReq importAppsItem) {
        if (this.importApps == null) {
            this.importApps = new ArrayList<>();
        }
        this.importApps.add(importAppsItem);
        return this;
    }

    public BatchImportAppReq withImportApps(Consumer<List<AppSrcReq>> importAppsSetter) {
        if (this.importApps == null) {
            this.importApps = new ArrayList<>();
        }
        importAppsSetter.accept(this.importApps);
        return this;
    }

    /**
     * 源应用列表
     * @return importApps
     */
    public List<AppSrcReq> getImportApps() {
        return importApps;
    }

    public void setImportApps(List<AppSrcReq> importApps) {
        this.importApps = importApps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchImportAppReq that = (BatchImportAppReq) obj;
        return Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.importApps, that.importApps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId, importApps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportAppReq {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    importApps: ").append(toIndentedString(importApps)).append("\n");
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
