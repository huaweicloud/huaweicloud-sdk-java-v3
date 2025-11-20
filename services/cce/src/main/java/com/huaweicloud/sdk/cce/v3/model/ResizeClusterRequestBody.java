package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 变更集群规格的请求体
 */
public class ResizeClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorResize")

    private String flavorResize;

    /**
     * Gets or Sets skippedTasks
     */
    public static final class SkippedTasksEnum {

        /**
         * Enum INGRESSCHECKER for value: "IngressChecker"
         */
        public static final SkippedTasksEnum INGRESSCHECKER = new SkippedTasksEnum("IngressChecker");

        private static final Map<String, SkippedTasksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SkippedTasksEnum> createStaticFields() {
            Map<String, SkippedTasksEnum> map = new HashMap<>();
            map.put("IngressChecker", INGRESSCHECKER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SkippedTasksEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SkippedTasksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkippedTasksEnum(value));
        }

        public static SkippedTasksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SkippedTasksEnum) {
                return this.value.equals(((SkippedTasksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skippedTasks")

    private List<SkippedTasksEnum> skippedTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ResizeClusterRequestBodyExtendParam extendParam;

    public ResizeClusterRequestBody withFlavorResize(String flavorResize) {
        this.flavorResize = flavorResize;
        return this;
    }

    /**
     * **参数解释**： 要变更的目标规格。仅支持变更集群最大节点规模，不支持变更控制节点数，且不支持降低集群规格。例如原集群规格为cce.s2.medium，仅支持变更至cce.s2.large及以上规格，不支持变更至cce.s2.small或cce.s1.medium。 **约束限制**： VPC 网络模型建议集群规模为 1000 节点及以下。集群本身规模受 VPC 路由表配额上限限制，若扩容规格至cce.s2.xlarge，可能出现实际节点规模无法达到目标规模的情况。 **取值范围**： - cce.s1.small: 小规模单控制节点CCE集群（最大50节点） - cce.s1.medium: 中等规模单控制节点CCE集群（最大200节点） - cce.s2.small: 小规模三控制节点CCE集群（最大50节点） - cce.s2.medium: 中等规模三控制节点CCE集群（最大200节点） - cce.s2.large: 大规模三控制节点CCE集群（最大1000节点） - cce.s2.xlarge: 超大规模三控制节点CCE集群（最大2000节点） - [cce.s3.small: 小规模五控制节点CCE集群（最大50节点）](tag:hcs,hcs_sm) - [cce.s3.medium: 中等规模五控制节点CCE集群（最大200节点）](tag:hcs,hcs_sm) - [cce.s3.large: 大规模五控制节点CCE集群（最大1000节点）](tag:hcs,hcs_sm) - [cce.s3.xlarge: 超大规模五控制节点CCE集群（最大2000节点）](tag:hcs,hcs_sm) **默认取值**： 不涉及  >    关于规格参数中的字段说明如下： >    - s1：单控制节点的集群，控制节点数为1。单控制节点故障后，集群将不可用，但已运行工作负载不受影响。 >    - s2：三控制节点的集群，即高可用集群，控制节点数为3。当某个控制节点故障时，集群仍然可用。 >    [- s3：五控制节点的集群，即超高可用集群，控制节点数为5。当某2个控制节点故障时，集群仍然可用。](tag:hcs,hcs_sm) >    [- dec：表示专属云的CCE集群规格。例如cce.dec.s1.small表示小规模单控制节点的专属云CCE集群（最大50节点）。](tag:hws,hws_hk) >    - small：表示集群支持管理的最大节点规模为50节点。 >    - medium：表示集群支持管理的最大节点规模为200节点。 >    - large：表示集群支持管理的最大节点规模为1000节点。 >    - xlarge：表示集群支持管理的最大节点规模为2000节点。 
     * @return flavorResize
     */
    public String getFlavorResize() {
        return flavorResize;
    }

    public void setFlavorResize(String flavorResize) {
        this.flavorResize = flavorResize;
    }

    public ResizeClusterRequestBody withSkippedTasks(List<SkippedTasksEnum> skippedTasks) {
        this.skippedTasks = skippedTasks;
        return this;
    }

    public ResizeClusterRequestBody addSkippedTasksItem(SkippedTasksEnum skippedTasksItem) {
        if (this.skippedTasks == null) {
            this.skippedTasks = new ArrayList<>();
        }
        this.skippedTasks.add(skippedTasksItem);
        return this;
    }

    public ResizeClusterRequestBody withSkippedTasks(Consumer<List<SkippedTasksEnum>> skippedTasksSetter) {
        if (this.skippedTasks == null) {
            this.skippedTasks = new ArrayList<>();
        }
        skippedTasksSetter.accept(this.skippedTasks);
        return this;
    }

    /**
     * **参数解释**： 该参数用于控制集群规格变更时跳过部分任务。 **约束限制**： 无 **取值范围**： - IngressChecker: 集群规格变更时跳过Ingress与ELB配置一致性检查  > - 跳过Ingress与ELB配置一致性检查可能导致业务中断，请谨慎操作！ > - 集群不可用或者过载时，必须跳过Ingress与ELB配置一致性检查，否则会导致集群规格变更失败。[请确保变更集群规格前已按 [ELB Ingress与ELB配置不一致如何处理？](https://support.huaweicloud.com/cce_faq/cce_faq_00493.html) 指南解决一致性问题。](tag:hws)[请确保变更集群规格前已按 [ELB Ingress与ELB配置不一致如何处理？](https://support.huaweicloud.com/intl/zh-cn/cce_faq/cce_faq_00493.html) 指南解决一致性问题。](tag:hws_hk)  **默认取值**： 集群不可用时默认包含IngressChecker
     * @return skippedTasks
     */
    public List<SkippedTasksEnum> getSkippedTasks() {
        return skippedTasks;
    }

    public void setSkippedTasks(List<SkippedTasksEnum> skippedTasks) {
        this.skippedTasks = skippedTasks;
    }

    public ResizeClusterRequestBody withExtendParam(ResizeClusterRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ResizeClusterRequestBody withExtendParam(Consumer<ResizeClusterRequestBodyExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ResizeClusterRequestBodyExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ResizeClusterRequestBodyExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ResizeClusterRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterRequestBody that = (ResizeClusterRequestBody) obj;
        return Objects.equals(this.flavorResize, that.flavorResize)
            && Objects.equals(this.skippedTasks, that.skippedTasks)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorResize, skippedTasks, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterRequestBody {\n");
        sb.append("    flavorResize: ").append(toIndentedString(flavorResize)).append("\n");
        sb.append("    skippedTasks: ").append(toIndentedString(skippedTasks)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
