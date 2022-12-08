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
public class DeleteClusterRequest {

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
            DeleteEfsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteEfsEnum(value);
            }
            return result;
        }

        public static DeleteEfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteEfsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            DeleteEniEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteEniEnum(value);
            }
            return result;
        }

        public static DeleteEniEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteEniEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 是否删除evs（云硬盘）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class DeleteEvsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEvsEnum TRUE = new DeleteEvsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEvsEnum BLOCK = new DeleteEvsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEvsEnum TRY = new DeleteEvsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEvsEnum FALSE = new DeleteEvsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEvsEnum SKIP = new DeleteEvsEnum("skip");

        private static final Map<String, DeleteEvsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEvsEnum> createStaticFields() {
            Map<String, DeleteEvsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEvsEnum(String value) {
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
        public static DeleteEvsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeleteEvsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteEvsEnum(value);
            }
            return result;
        }

        public static DeleteEvsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteEvsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEvsEnum) {
                return this.value.equals(((DeleteEvsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_evs")

    private DeleteEvsEnum deleteEvs;

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
            DeleteNetEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteNetEnum(value);
            }
            return result;
        }

        public static DeleteNetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteNetEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            DeleteObsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteObsEnum(value);
            }
            return result;
        }

        public static DeleteObsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteObsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 是否删除sfs（文件存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     */
    public static final class DeleteSfsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteSfsEnum TRUE = new DeleteSfsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteSfsEnum BLOCK = new DeleteSfsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteSfsEnum TRY = new DeleteSfsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteSfsEnum FALSE = new DeleteSfsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteSfsEnum SKIP = new DeleteSfsEnum("skip");

        private static final Map<String, DeleteSfsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteSfsEnum> createStaticFields() {
            Map<String, DeleteSfsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteSfsEnum(String value) {
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
        public static DeleteSfsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeleteSfsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteSfsEnum(value);
            }
            return result;
        }

        public static DeleteSfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteSfsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteSfsEnum) {
                return this.value.equals(((DeleteSfsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_sfs")

    private DeleteSfsEnum deleteSfs;

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
            DeleteSfs30Enum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteSfs30Enum(value);
            }
            return result;
        }

        public static DeleteSfs30Enum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteSfs30Enum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 是否使用包周期集群删除参数预置模式（仅对包周期集群生效）。  需要和其他删除选项参数一起使用，未指定的参数，则使用默认值。  使用该参数，集群不执行真正的删除，仅将本次请求的全部query参数都预置到集群数据库中，用于包周期集群退订时识别用户要删除的资源。  允许重复执行，覆盖预置的删除参数。  枚举取值： - true  (预置模式，仅预置query参数，不执行删除)
     */
    public static final class TobedeletedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final TobedeletedEnum TRUE = new TobedeletedEnum("true");

        private static final Map<String, TobedeletedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TobedeletedEnum> createStaticFields() {
            Map<String, TobedeletedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TobedeletedEnum(String value) {
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
        public static TobedeletedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TobedeletedEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TobedeletedEnum(value);
            }
            return result;
        }

        public static TobedeletedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TobedeletedEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TobedeletedEnum) {
                return this.value.equals(((TobedeletedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tobedeleted")

    private TobedeletedEnum tobedeleted;

    public DeleteClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群 ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteClusterRequest withDeleteEfs(DeleteEfsEnum deleteEfs) {
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

    public DeleteClusterRequest withDeleteEni(DeleteEniEnum deleteEni) {
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

    public DeleteClusterRequest withDeleteEvs(DeleteEvsEnum deleteEvs) {
        this.deleteEvs = deleteEvs;
        return this;
    }

    /**
     * 是否删除evs（云硬盘）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return deleteEvs
     */
    public DeleteEvsEnum getDeleteEvs() {
        return deleteEvs;
    }

    public void setDeleteEvs(DeleteEvsEnum deleteEvs) {
        this.deleteEvs = deleteEvs;
    }

    public DeleteClusterRequest withDeleteNet(DeleteNetEnum deleteNet) {
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

    public DeleteClusterRequest withDeleteObs(DeleteObsEnum deleteObs) {
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

    public DeleteClusterRequest withDeleteSfs(DeleteSfsEnum deleteSfs) {
        this.deleteSfs = deleteSfs;
        return this;
    }

    /**
     * 是否删除sfs（文件存储卷）， 枚举取值： - true或block (执行删除流程，失败则阻塞后续流程) - try (执行删除流程，失败则忽略，并继续执行后续流程) - false或skip (跳过删除流程，默认选项)
     * @return deleteSfs
     */
    public DeleteSfsEnum getDeleteSfs() {
        return deleteSfs;
    }

    public void setDeleteSfs(DeleteSfsEnum deleteSfs) {
        this.deleteSfs = deleteSfs;
    }

    public DeleteClusterRequest withDeleteSfs30(DeleteSfs30Enum deleteSfs30) {
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

    public DeleteClusterRequest withTobedeleted(TobedeletedEnum tobedeleted) {
        this.tobedeleted = tobedeleted;
        return this;
    }

    /**
     * 是否使用包周期集群删除参数预置模式（仅对包周期集群生效）。  需要和其他删除选项参数一起使用，未指定的参数，则使用默认值。  使用该参数，集群不执行真正的删除，仅将本次请求的全部query参数都预置到集群数据库中，用于包周期集群退订时识别用户要删除的资源。  允许重复执行，覆盖预置的删除参数。  枚举取值： - true  (预置模式，仅预置query参数，不执行删除)
     * @return tobedeleted
     */
    public TobedeletedEnum getTobedeleted() {
        return tobedeleted;
    }

    public void setTobedeleted(TobedeletedEnum tobedeleted) {
        this.tobedeleted = tobedeleted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteClusterRequest deleteClusterRequest = (DeleteClusterRequest) o;
        return Objects.equals(this.clusterId, deleteClusterRequest.clusterId)
            && Objects.equals(this.deleteEfs, deleteClusterRequest.deleteEfs)
            && Objects.equals(this.deleteEni, deleteClusterRequest.deleteEni)
            && Objects.equals(this.deleteEvs, deleteClusterRequest.deleteEvs)
            && Objects.equals(this.deleteNet, deleteClusterRequest.deleteNet)
            && Objects.equals(this.deleteObs, deleteClusterRequest.deleteObs)
            && Objects.equals(this.deleteSfs, deleteClusterRequest.deleteSfs)
            && Objects.equals(this.deleteSfs30, deleteClusterRequest.deleteSfs30)
            && Objects.equals(this.tobedeleted, deleteClusterRequest.tobedeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            deleteEfs,
            deleteEni,
            deleteEvs,
            deleteNet,
            deleteObs,
            deleteSfs,
            deleteSfs30,
            tobedeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    deleteEfs: ").append(toIndentedString(deleteEfs)).append("\n");
        sb.append("    deleteEni: ").append(toIndentedString(deleteEni)).append("\n");
        sb.append("    deleteEvs: ").append(toIndentedString(deleteEvs)).append("\n");
        sb.append("    deleteNet: ").append(toIndentedString(deleteNet)).append("\n");
        sb.append("    deleteObs: ").append(toIndentedString(deleteObs)).append("\n");
        sb.append("    deleteSfs: ").append(toIndentedString(deleteSfs)).append("\n");
        sb.append("    deleteSfs30: ").append(toIndentedString(deleteSfs30)).append("\n");
        sb.append("    tobedeleted: ").append(toIndentedString(tobedeleted)).append("\n");
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
