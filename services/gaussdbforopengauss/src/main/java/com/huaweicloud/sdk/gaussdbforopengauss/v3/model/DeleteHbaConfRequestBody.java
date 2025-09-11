package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteHbaConfRequestBody
 */
public class DeleteHbaConfRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hba_confs")

    private List<HbaConfOption> hbaConfs = null;

    public DeleteHbaConfRequestBody withHbaConfs(List<HbaConfOption> hbaConfs) {
        this.hbaConfs = hbaConfs;
        return this;
    }

    public DeleteHbaConfRequestBody addHbaConfsItem(HbaConfOption hbaConfsItem) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        this.hbaConfs.add(hbaConfsItem);
        return this;
    }

    public DeleteHbaConfRequestBody withHbaConfs(Consumer<List<HbaConfOption>> hbaConfsSetter) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        hbaConfsSetter.accept(this.hbaConfs);
        return this;
    }

    /**
     * **参数解释**: 需要删除的hba配置信息。 **取值范围**: 不涉及。
     * @return hbaConfs
     */
    public List<HbaConfOption> getHbaConfs() {
        return hbaConfs;
    }

    public void setHbaConfs(List<HbaConfOption> hbaConfs) {
        this.hbaConfs = hbaConfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteHbaConfRequestBody that = (DeleteHbaConfRequestBody) obj;
        return Objects.equals(this.hbaConfs, that.hbaConfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hbaConfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHbaConfRequestBody {\n");
        sb.append("    hbaConfs: ").append(toIndentedString(hbaConfs)).append("\n");
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
