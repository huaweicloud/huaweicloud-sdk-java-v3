package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAutopilotClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * 是否删除SFS Turbo（极速文件存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class DeleteEfsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEfsEnum TRUE = new DeleteEfsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEfsEnum BLOCK = new DeleteEfsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEfsEnum TRY = new DeleteEfsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEfsEnum FALSE = new DeleteEfsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEfsEnum SKIP = new DeleteEfsEnum("skip");

        private static final Map<String, DeleteEfsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEfsEnum> createStaticFields() {
            Map<String, DeleteEfsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEfsEnum(String value) {
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
        public static DeleteEfsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteEfsEnum(value));
        }

        public static DeleteEfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEfsEnum) {
                return this.value.equals(((DeleteEfsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_efs")

    private DeleteEfsEnum deleteEfs;

    /**
     * 是否删除eni ports（原生弹性网卡）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程，默认选项) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程)
     */
    public static final class DeleteEniEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEniEnum TRUE = new DeleteEniEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEniEnum BLOCK = new DeleteEniEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEniEnum TRY = new DeleteEniEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEniEnum FALSE = new DeleteEniEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEniEnum SKIP = new DeleteEniEnum("skip");

        private static final Map<String, DeleteEniEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEniEnum> createStaticFields() {
            Map<String, DeleteEniEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEniEnum(String value) {
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
        public static DeleteEniEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteEniEnum(value));
        }

        public static DeleteEniEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEniEnum) {
                return this.value.equals(((DeleteEniEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_eni")

    private DeleteEniEnum deleteEni;

    /**
     * 是否删除elb（弹性负载均衡）等集群Service/Ingress相关资源。 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程，默认选项) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程)
     */
    public static final class DeleteNetEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteNetEnum TRUE = new DeleteNetEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteNetEnum BLOCK = new DeleteNetEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteNetEnum TRY = new DeleteNetEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteNetEnum FALSE = new DeleteNetEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteNetEnum SKIP = new DeleteNetEnum("skip");

        private static final Map<String, DeleteNetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteNetEnum> createStaticFields() {
            Map<String, DeleteNetEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteNetEnum(String value) {
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
        public static DeleteNetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteNetEnum(value));
        }

        public static DeleteNetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteNetEnum) {
                return this.value.equals(((DeleteNetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_net")

    private DeleteNetEnum deleteNet;

    /**
     * 是否删除obs（对象存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class DeleteObsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteObsEnum TRUE = new DeleteObsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteObsEnum BLOCK = new DeleteObsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteObsEnum TRY = new DeleteObsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteObsEnum FALSE = new DeleteObsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteObsEnum SKIP = new DeleteObsEnum("skip");

        private static final Map<String, DeleteObsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteObsEnum> createStaticFields() {
            Map<String, DeleteObsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteObsEnum(String value) {
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
        public static DeleteObsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteObsEnum(value));
        }

        public static DeleteObsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteObsEnum) {
                return this.value.equals(((DeleteObsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_obs")

    private DeleteObsEnum deleteObs;

    /**
     * 是否删除sfs3.0（文件存储卷3.0）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class DeleteSfs30Enum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteSfs30Enum TRUE = new DeleteSfs30Enum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteSfs30Enum BLOCK = new DeleteSfs30Enum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteSfs30Enum TRY = new DeleteSfs30Enum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteSfs30Enum FALSE = new DeleteSfs30Enum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteSfs30Enum SKIP = new DeleteSfs30Enum("skip");

        private static final Map<String, DeleteSfs30Enum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteSfs30Enum> createStaticFields() {
            Map<String, DeleteSfs30Enum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteSfs30Enum(String value) {
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
        public static DeleteSfs30Enum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteSfs30Enum(value));
        }

        public static DeleteSfs30Enum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteSfs30Enum) {
                return this.value.equals(((DeleteSfs30Enum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_sfs30")

    private DeleteSfs30Enum deleteSfs30;

    /**
     * 是否删除LTS LogStream（日志流）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class LtsReclaimPolicyEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final LtsReclaimPolicyEnum TRUE = new LtsReclaimPolicyEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final LtsReclaimPolicyEnum BLOCK = new LtsReclaimPolicyEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final LtsReclaimPolicyEnum TRY = new LtsReclaimPolicyEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final LtsReclaimPolicyEnum FALSE = new LtsReclaimPolicyEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final LtsReclaimPolicyEnum SKIP = new LtsReclaimPolicyEnum("skip");

        private static final Map<String, LtsReclaimPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LtsReclaimPolicyEnum> createStaticFields() {
            Map<String, LtsReclaimPolicyEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LtsReclaimPolicyEnum(String value) {
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
        public static LtsReclaimPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LtsReclaimPolicyEnum(value));
        }

        public static LtsReclaimPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LtsReclaimPolicyEnum) {
                return this.value.equals(((LtsReclaimPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_reclaim_policy")

    private LtsReclaimPolicyEnum ltsReclaimPolicy;

    public DeleteAutopilotClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteAutopilotClusterRequest withDeleteEfs(DeleteEfsEnum deleteEfs) {
        this.deleteEfs = deleteEfs;
        return this;
    }

    /**
     * 是否删除SFS Turbo（极速文件存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return deleteEfs
     */
    public DeleteEfsEnum getDeleteEfs() {
        return deleteEfs;
    }

    public void setDeleteEfs(DeleteEfsEnum deleteEfs) {
        this.deleteEfs = deleteEfs;
    }

    public DeleteAutopilotClusterRequest withDeleteEni(DeleteEniEnum deleteEni) {
        this.deleteEni = deleteEni;
        return this;
    }

    /**
     * 是否删除eni ports（原生弹性网卡）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程，默认选项) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程)
     * @return deleteEni
     */
    public DeleteEniEnum getDeleteEni() {
        return deleteEni;
    }

    public void setDeleteEni(DeleteEniEnum deleteEni) {
        this.deleteEni = deleteEni;
    }

    public DeleteAutopilotClusterRequest withDeleteNet(DeleteNetEnum deleteNet) {
        this.deleteNet = deleteNet;
        return this;
    }

    /**
     * 是否删除elb（弹性负载均衡）等集群Service/Ingress相关资源。 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程，默认选项) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程)
     * @return deleteNet
     */
    public DeleteNetEnum getDeleteNet() {
        return deleteNet;
    }

    public void setDeleteNet(DeleteNetEnum deleteNet) {
        this.deleteNet = deleteNet;
    }

    public DeleteAutopilotClusterRequest withDeleteObs(DeleteObsEnum deleteObs) {
        this.deleteObs = deleteObs;
        return this;
    }

    /**
     * 是否删除obs（对象存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return deleteObs
     */
    public DeleteObsEnum getDeleteObs() {
        return deleteObs;
    }

    public void setDeleteObs(DeleteObsEnum deleteObs) {
        this.deleteObs = deleteObs;
    }

    public DeleteAutopilotClusterRequest withDeleteSfs30(DeleteSfs30Enum deleteSfs30) {
        this.deleteSfs30 = deleteSfs30;
        return this;
    }

    /**
     * 是否删除sfs3.0（文件存储卷3.0）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return deleteSfs30
     */
    public DeleteSfs30Enum getDeleteSfs30() {
        return deleteSfs30;
    }

    public void setDeleteSfs30(DeleteSfs30Enum deleteSfs30) {
        this.deleteSfs30 = deleteSfs30;
    }

    public DeleteAutopilotClusterRequest withLtsReclaimPolicy(LtsReclaimPolicyEnum ltsReclaimPolicy) {
        this.ltsReclaimPolicy = ltsReclaimPolicy;
        return this;
    }

    /**
     * 是否删除LTS LogStream（日志流）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return ltsReclaimPolicy
     */
    public LtsReclaimPolicyEnum getLtsReclaimPolicy() {
        return ltsReclaimPolicy;
    }

    public void setLtsReclaimPolicy(LtsReclaimPolicyEnum ltsReclaimPolicy) {
        this.ltsReclaimPolicy = ltsReclaimPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAutopilotClusterRequest that = (DeleteAutopilotClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.deleteEfs, that.deleteEfs)
            && Objects.equals(this.deleteEni, that.deleteEni) && Objects.equals(this.deleteNet, that.deleteNet)
            && Objects.equals(this.deleteObs, that.deleteObs) && Objects.equals(this.deleteSfs30, that.deleteSfs30)
            && Objects.equals(this.ltsReclaimPolicy, that.ltsReclaimPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, deleteEfs, deleteEni, deleteNet, deleteObs, deleteSfs30, ltsReclaimPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAutopilotClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    deleteEfs: ").append(toIndentedString(deleteEfs)).append("\n");
        sb.append("    deleteEni: ").append(toIndentedString(deleteEni)).append("\n");
        sb.append("    deleteNet: ").append(toIndentedString(deleteNet)).append("\n");
        sb.append("    deleteObs: ").append(toIndentedString(deleteObs)).append("\n");
        sb.append("    deleteSfs30: ").append(toIndentedString(deleteSfs30)).append("\n");
        sb.append("    ltsReclaimPolicy: ").append(toIndentedString(ltsReclaimPolicy)).append("\n");
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
