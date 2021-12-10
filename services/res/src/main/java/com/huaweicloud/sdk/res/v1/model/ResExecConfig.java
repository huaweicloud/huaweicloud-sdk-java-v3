package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ResExecConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_calc_spec")

    private SparkCalcSpec sparkCalcSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_option_confs")

    private List<SparkOptionConf> sparkOptionConfs = null;

    public ResExecConfig withSparkCalcSpec(SparkCalcSpec sparkCalcSpec) {
        this.sparkCalcSpec = sparkCalcSpec;
        return this;
    }

    public ResExecConfig withSparkCalcSpec(Consumer<SparkCalcSpec> sparkCalcSpecSetter) {
        if (this.sparkCalcSpec == null) {
            this.sparkCalcSpec = new SparkCalcSpec();
            sparkCalcSpecSetter.accept(this.sparkCalcSpec);
        }

        return this;
    }

    /** Get sparkCalcSpec
     * 
     * @return sparkCalcSpec */
    public SparkCalcSpec getSparkCalcSpec() {
        return sparkCalcSpec;
    }

    public void setSparkCalcSpec(SparkCalcSpec sparkCalcSpec) {
        this.sparkCalcSpec = sparkCalcSpec;
    }

    public ResExecConfig withSparkOptionConfs(List<SparkOptionConf> sparkOptionConfs) {
        this.sparkOptionConfs = sparkOptionConfs;
        return this;
    }

    public ResExecConfig addSparkOptionConfsItem(SparkOptionConf sparkOptionConfsItem) {
        if (this.sparkOptionConfs == null) {
            this.sparkOptionConfs = new ArrayList<>();
        }
        this.sparkOptionConfs.add(sparkOptionConfsItem);
        return this;
    }

    public ResExecConfig withSparkOptionConfs(Consumer<List<SparkOptionConf>> sparkOptionConfsSetter) {
        if (this.sparkOptionConfs == null) {
            this.sparkOptionConfs = new ArrayList<>();
        }
        sparkOptionConfsSetter.accept(this.sparkOptionConfs);
        return this;
    }

    /** spark可选配置项
     * 
     * @return sparkOptionConfs */
    public List<SparkOptionConf> getSparkOptionConfs() {
        return sparkOptionConfs;
    }

    public void setSparkOptionConfs(List<SparkOptionConf> sparkOptionConfs) {
        this.sparkOptionConfs = sparkOptionConfs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResExecConfig resExecConfig = (ResExecConfig) o;
        return Objects.equals(this.sparkCalcSpec, resExecConfig.sparkCalcSpec)
            && Objects.equals(this.sparkOptionConfs, resExecConfig.sparkOptionConfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sparkCalcSpec, sparkOptionConfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResExecConfig {\n");
        sb.append("    sparkCalcSpec: ").append(toIndentedString(sparkCalcSpec)).append("\n");
        sb.append("    sparkOptionConfs: ").append(toIndentedString(sparkOptionConfs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
