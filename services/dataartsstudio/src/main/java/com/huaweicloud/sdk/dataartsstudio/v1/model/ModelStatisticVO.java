package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModelStatisticVO
 */
public class ModelStatisticVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private ModelLevel level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private Integer db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb")

    private Integer tb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_published")

    private Integer tbPublished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd")

    private Integer fd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_published")

    private Integer fdPublished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "st")

    private Double st;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "st_published")

    private Double stPublished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private WorkspaceVO model;

    public ModelStatisticVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public ModelStatisticVO withLevel(ModelLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get level
     * @return level
     */
    public ModelLevel getLevel() {
        return level;
    }

    public void setLevel(ModelLevel level) {
        this.level = level;
    }

    public ModelStatisticVO withDb(Integer db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库。
     * @return db
     */
    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public ModelStatisticVO withTb(Integer tb) {
        this.tb = tb;
        return this;
    }

    /**
     * 数据表。
     * @return tb
     */
    public Integer getTb() {
        return tb;
    }

    public void setTb(Integer tb) {
        this.tb = tb;
    }

    public ModelStatisticVO withTbPublished(Integer tbPublished) {
        this.tbPublished = tbPublished;
        return this;
    }

    /**
     * 已发布的数据表。
     * @return tbPublished
     */
    public Integer getTbPublished() {
        return tbPublished;
    }

    public void setTbPublished(Integer tbPublished) {
        this.tbPublished = tbPublished;
    }

    public ModelStatisticVO withFd(Integer fd) {
        this.fd = fd;
        return this;
    }

    /**
     * 字段。
     * @return fd
     */
    public Integer getFd() {
        return fd;
    }

    public void setFd(Integer fd) {
        this.fd = fd;
    }

    public ModelStatisticVO withFdPublished(Integer fdPublished) {
        this.fdPublished = fdPublished;
        return this;
    }

    /**
     * 已发布的字段。
     * @return fdPublished
     */
    public Integer getFdPublished() {
        return fdPublished;
    }

    public void setFdPublished(Integer fdPublished) {
        this.fdPublished = fdPublished;
    }

    public ModelStatisticVO withSt(Double st) {
        this.st = st;
        return this;
    }

    /**
     * 标准覆盖率。
     * @return st
     */
    public Double getSt() {
        return st;
    }

    public void setSt(Double st) {
        this.st = st;
    }

    public ModelStatisticVO withStPublished(Double stPublished) {
        this.stPublished = stPublished;
        return this;
    }

    /**
     * 已发布的标准覆盖率。
     * @return stPublished
     */
    public Double getStPublished() {
        return stPublished;
    }

    public void setStPublished(Double stPublished) {
        this.stPublished = stPublished;
    }

    public ModelStatisticVO withModel(WorkspaceVO model) {
        this.model = model;
        return this;
    }

    public ModelStatisticVO withModel(Consumer<WorkspaceVO> modelSetter) {
        if (this.model == null) {
            this.model = new WorkspaceVO();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public WorkspaceVO getModel() {
        return model;
    }

    public void setModel(WorkspaceVO model) {
        this.model = model;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelStatisticVO that = (ModelStatisticVO) obj;
        return Objects.equals(this.bizType, that.bizType) && Objects.equals(this.level, that.level)
            && Objects.equals(this.db, that.db) && Objects.equals(this.tb, that.tb)
            && Objects.equals(this.tbPublished, that.tbPublished) && Objects.equals(this.fd, that.fd)
            && Objects.equals(this.fdPublished, that.fdPublished) && Objects.equals(this.st, that.st)
            && Objects.equals(this.stPublished, that.stPublished) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bizType, level, db, tb, tbPublished, fd, fdPublished, st, stPublished, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelStatisticVO {\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    tb: ").append(toIndentedString(tb)).append("\n");
        sb.append("    tbPublished: ").append(toIndentedString(tbPublished)).append("\n");
        sb.append("    fd: ").append(toIndentedString(fd)).append("\n");
        sb.append("    fdPublished: ").append(toIndentedString(fdPublished)).append("\n");
        sb.append("    st: ").append(toIndentedString(st)).append("\n");
        sb.append("    stPublished: ").append(toIndentedString(stPublished)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
