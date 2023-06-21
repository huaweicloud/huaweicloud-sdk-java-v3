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
    @JsonProperty(value = "data_source_vos")

    private List<ApigDataSourceVo> dataSourceVos = null;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApigDataSourcesVo apigDataSourcesVo = (ApigDataSourcesVo) o;
        return Objects.equals(this.dataSourceVos, apigDataSourcesVo.dataSourceVos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceVos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigDataSourcesVo {\n");
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
