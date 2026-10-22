package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 候选实例信息。 **取值范围：** 不涉及。
 */
public class BiactiveInstanceV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_size")

    private String diskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_disk_size")

    private String usedDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    public BiactiveInstanceV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 实例ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BiactiveInstanceV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BiactiveInstanceV3 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 实例状态。 **取值范围：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BiactiveInstanceV3 withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public BiactiveInstanceV3 addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public BiactiveInstanceV3 withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 实例当前支持的操作。 **取值范围：** 不涉及。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public BiactiveInstanceV3 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目ID。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BiactiveInstanceV3 withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名称。 **取值范围：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BiactiveInstanceV3 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * **参数解释：** 区域。 **取值范围：** 不涉及。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public BiactiveInstanceV3 withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * **参数解释：** 节点数量。 **取值范围：** 不涉及。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public BiactiveInstanceV3 withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释：** vCPU数量。 **取值范围：** 不涉及。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public BiactiveInstanceV3 withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * **参数解释：** 内存大小，单位GB。 **取值范围：** 不涉及。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public BiactiveInstanceV3 withDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * **参数解释：** 磁盘大小，单位GB。 **取值范围：** 不涉及。
     * @return diskSize
     */
    public String getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(String diskSize) {
        this.diskSize = diskSize;
    }

    public BiactiveInstanceV3 withUsedDiskSize(String usedDiskSize) {
        this.usedDiskSize = usedDiskSize;
        return this;
    }

    /**
     * **参数解释：** 已使用磁盘大小，单位GB。 **取值范围：** 不涉及。
     * @return usedDiskSize
     */
    public String getUsedDiskSize() {
        return usedDiskSize;
    }

    public void setUsedDiskSize(String usedDiskSize) {
        this.usedDiskSize = usedDiskSize;
    }

    public BiactiveInstanceV3 withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释：** VPC CIDR。 **取值范围：** 不涉及。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BiactiveInstanceV3 that = (BiactiveInstanceV3) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.diskSize, that.diskSize) && Objects.equals(this.usedDiskSize, that.usedDiskSize)
            && Objects.equals(this.cidr, that.cidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            actions,
            projectId,
            projectName,
            regionCode,
            nodeNum,
            vcpus,
            ram,
            diskSize,
            usedDiskSize,
            cidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BiactiveInstanceV3 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
        sb.append("    usedDiskSize: ").append(toIndentedString(usedDiskSize)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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
