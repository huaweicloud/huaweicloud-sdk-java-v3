package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建据连接结构体列表信息
 */
public class ApigDataSourcesVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Integer mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Integer visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_vos")

    private List<ApigDataSourceVo> dataSourceVos = null;

    public ApigDataSourcesVo withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 企业模式空间下的数据连接还是简单模式空间下的连接,0:简单模式，1：企业模式
     * minimum: 0
     * maximum: 1
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public ApigDataSourcesVo withVisible(Integer visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 连接是否可见,0：不可见，1：可见
     * minimum: 0
     * maximum: 1
     * @return visible
     */
    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public ApigDataSourcesVo withDataSourceVos(List<ApigDataSourceVo> dataSourceVos) {
        this.dataSourceVos = dataSourceVos;
        return this;
    }

    public ApigDataSourcesVo addDataSourceVosItem(ApigDataSourceVo dataSourceVosItem) {
        if (this.dataSourceVos == null) {
            this.dataSourceVos = new ArrayList<>();
        }
        this.dataSourceVos.add(dataSourceVosItem);
        return this;
    }

    public ApigDataSourcesVo withDataSourceVos(Consumer<List<ApigDataSourceVo>> dataSourceVosSetter) {
        if (this.dataSourceVos == null) {
            this.dataSourceVos = new ArrayList<>();
        }
        dataSourceVosSetter.accept(this.dataSourceVos);
        return this;
    }

    /**
     * 数据源结构体
     * @return dataSourceVos
     */
    public List<ApigDataSourceVo> getDataSourceVos() {
        return dataSourceVos;
    }

    public void setDataSourceVos(List<ApigDataSourceVo> dataSourceVos) {
        this.dataSourceVos = dataSourceVos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApigDataSourcesVo that = (ApigDataSourcesVo) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.dataSourceVos, that.dataSourceVos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, visible, dataSourceVos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigDataSourcesVo {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    dataSourceVos: ").append(toIndentedString(dataSourceVos)).append("\n");
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
