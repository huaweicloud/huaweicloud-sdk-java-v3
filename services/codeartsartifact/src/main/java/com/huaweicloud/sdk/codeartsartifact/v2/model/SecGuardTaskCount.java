package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecGuardTaskCount
 */
public class SecGuardTaskCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private Integer task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact")

    private Integer artifact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opensource")

    private OpensourceCount opensource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virus")

    private Integer virus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private MalwareCount malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<SecGuardTaskDetail> list = null;

    public SecGuardTaskCount withTask(Integer task) {
        this.task = task;
        return this;
    }

    /**
     * **参数解释**: 扫描次数。 **取值范围**: 不涉及。
     * @return task
     */
    public Integer getTask() {
        return task;
    }

    public void setTask(Integer task) {
        this.task = task;
    }

    public SecGuardTaskCount withArtifact(Integer artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * **参数解释**: 扫描制品数。 **取值范围**: 不涉及。
     * @return artifact
     */
    public Integer getArtifact() {
        return artifact;
    }

    public void setArtifact(Integer artifact) {
        this.artifact = artifact;
    }

    public SecGuardTaskCount withOpensource(OpensourceCount opensource) {
        this.opensource = opensource;
        return this;
    }

    public SecGuardTaskCount withOpensource(Consumer<OpensourceCount> opensourceSetter) {
        if (this.opensource == null) {
            this.opensource = new OpensourceCount();
            opensourceSetter.accept(this.opensource);
        }

        return this;
    }

    /**
     * Get opensource
     * @return opensource
     */
    public OpensourceCount getOpensource() {
        return opensource;
    }

    public void setOpensource(OpensourceCount opensource) {
        this.opensource = opensource;
    }

    public SecGuardTaskCount withVirus(Integer virus) {
        this.virus = virus;
        return this;
    }

    /**
     * **参数解释**: 病毒文件数。 **取值范围**: 不涉及。
     * @return virus
     */
    public Integer getVirus() {
        return virus;
    }

    public void setVirus(Integer virus) {
        this.virus = virus;
    }

    public SecGuardTaskCount withMalware(MalwareCount malware) {
        this.malware = malware;
        return this;
    }

    public SecGuardTaskCount withMalware(Consumer<MalwareCount> malwareSetter) {
        if (this.malware == null) {
            this.malware = new MalwareCount();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public MalwareCount getMalware() {
        return malware;
    }

    public void setMalware(MalwareCount malware) {
        this.malware = malware;
    }

    public SecGuardTaskCount withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 扫描总数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SecGuardTaskCount withList(List<SecGuardTaskDetail> list) {
        this.list = list;
        return this;
    }

    public SecGuardTaskCount addListItem(SecGuardTaskDetail listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public SecGuardTaskCount withList(Consumer<List<SecGuardTaskDetail>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**: 扫描任务列表。 **取值范围**: 不涉及。
     * @return list
     */
    public List<SecGuardTaskDetail> getList() {
        return list;
    }

    public void setList(List<SecGuardTaskDetail> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecGuardTaskCount that = (SecGuardTaskCount) obj;
        return Objects.equals(this.task, that.task) && Objects.equals(this.artifact, that.artifact)
            && Objects.equals(this.opensource, that.opensource) && Objects.equals(this.virus, that.virus)
            && Objects.equals(this.malware, that.malware) && Objects.equals(this.total, that.total)
            && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, artifact, opensource, virus, malware, total, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecGuardTaskCount {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
        sb.append("    opensource: ").append(toIndentedString(opensource)).append("\n");
        sb.append("    virus: ").append(toIndentedString(virus)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
