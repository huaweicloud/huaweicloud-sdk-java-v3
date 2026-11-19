package com.huaweicloud.sdk.codeartsmodeling.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConvertPlantUml2DiagramRequestBody
 */
public class ConvertPlantUml2DiagramRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plant_uml_code")

    private String plantUmlCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagram_name")

    private String diagramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_uuid")

    private String packageUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_space_uuid")

    private String projectSpaceUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uuid")

    private String versionUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_element_uuids")

    private List<String> linkElementUuids = null;

    public ConvertPlantUml2DiagramRequestBody withPlantUmlCode(String plantUmlCode) {
        this.plantUmlCode = plantUmlCode;
        return this;
    }

    /**
     * plantuml代码
     * @return plantUmlCode
     */
    public String getPlantUmlCode() {
        return plantUmlCode;
    }

    public void setPlantUmlCode(String plantUmlCode) {
        this.plantUmlCode = plantUmlCode;
    }

    public ConvertPlantUml2DiagramRequestBody withDiagramName(String diagramName) {
        this.diagramName = diagramName;
        return this;
    }

    /**
     * 图名称
     * @return diagramName
     */
    public String getDiagramName() {
        return diagramName;
    }

    public void setDiagramName(String diagramName) {
        this.diagramName = diagramName;
    }

    public ConvertPlantUml2DiagramRequestBody withPackageUuid(String packageUuid) {
        this.packageUuid = packageUuid;
        return this;
    }

    /**
     * 包UUID
     * @return packageUuid
     */
    public String getPackageUuid() {
        return packageUuid;
    }

    public void setPackageUuid(String packageUuid) {
        this.packageUuid = packageUuid;
    }

    public ConvertPlantUml2DiagramRequestBody withProjectSpaceUuid(String projectSpaceUuid) {
        this.projectSpaceUuid = projectSpaceUuid;
        return this;
    }

    /**
     * 模型工程uuid
     * @return projectSpaceUuid
     */
    public String getProjectSpaceUuid() {
        return projectSpaceUuid;
    }

    public void setProjectSpaceUuid(String projectSpaceUuid) {
        this.projectSpaceUuid = projectSpaceUuid;
    }

    public ConvertPlantUml2DiagramRequestBody withVersionUuid(String versionUuid) {
        this.versionUuid = versionUuid;
        return this;
    }

    /**
     * 版本分支uuid
     * @return versionUuid
     */
    public String getVersionUuid() {
        return versionUuid;
    }

    public void setVersionUuid(String versionUuid) {
        this.versionUuid = versionUuid;
    }

    public ConvertPlantUml2DiagramRequestBody withLinkElementUuids(List<String> linkElementUuids) {
        this.linkElementUuids = linkElementUuids;
        return this;
    }

    public ConvertPlantUml2DiagramRequestBody addLinkElementUuidsItem(String linkElementUuidsItem) {
        if (this.linkElementUuids == null) {
            this.linkElementUuids = new ArrayList<>();
        }
        this.linkElementUuids.add(linkElementUuidsItem);
        return this;
    }

    public ConvertPlantUml2DiagramRequestBody withLinkElementUuids(Consumer<List<String>> linkElementUuidsSetter) {
        if (this.linkElementUuids == null) {
            this.linkElementUuids = new ArrayList<>();
        }
        linkElementUuidsSetter.accept(this.linkElementUuids);
        return this;
    }

    /**
     * 引用元素uuid列表
     * @return linkElementUuids
     */
    public List<String> getLinkElementUuids() {
        return linkElementUuids;
    }

    public void setLinkElementUuids(List<String> linkElementUuids) {
        this.linkElementUuids = linkElementUuids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConvertPlantUml2DiagramRequestBody that = (ConvertPlantUml2DiagramRequestBody) obj;
        return Objects.equals(this.plantUmlCode, that.plantUmlCode)
            && Objects.equals(this.diagramName, that.diagramName) && Objects.equals(this.packageUuid, that.packageUuid)
            && Objects.equals(this.projectSpaceUuid, that.projectSpaceUuid)
            && Objects.equals(this.versionUuid, that.versionUuid)
            && Objects.equals(this.linkElementUuids, that.linkElementUuids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plantUmlCode, diagramName, packageUuid, projectSpaceUuid, versionUuid, linkElementUuids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertPlantUml2DiagramRequestBody {\n");
        sb.append("    plantUmlCode: ").append(toIndentedString(plantUmlCode)).append("\n");
        sb.append("    diagramName: ").append(toIndentedString(diagramName)).append("\n");
        sb.append("    packageUuid: ").append(toIndentedString(packageUuid)).append("\n");
        sb.append("    projectSpaceUuid: ").append(toIndentedString(projectSpaceUuid)).append("\n");
        sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
        sb.append("    linkElementUuids: ").append(toIndentedString(linkElementUuids)).append("\n");
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
