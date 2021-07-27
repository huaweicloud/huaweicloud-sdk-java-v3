package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class GaussDBforNoSQLMeta {

    public static final HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfiguration = genForapplyConfiguration();

    private static HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> genForapplyConfiguration() {
        // basic
        HttpRequestDef.Builder<ApplyConfigurationRequest, ApplyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ApplyConfigurationRequest.class, ApplyConfigurationResponse.class)
                .withName("ApplyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ApplyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApplyConfigurationRequestBody.class,
            f -> f.withMarshaller(ApplyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction = genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchTagActionRequestBody.class,
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration = genForcreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForcreateConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationRequest, CreateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationRequest.class, CreateConfigurationResponse.class)
                .withName("CreateConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateConfigurationRequestBody.class,
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance = genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateInstanceRequestBody.class,
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration = genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
                .withName("DeleteConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance = genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNode = genForexpandInstanceNode();

    private static HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> genForexpandInstanceNode() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandInstanceNodeRequest.class, ExpandInstanceNodeResponse.class)
                .withName("ExpandInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-node")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ExpandInstanceNodeRequestBody.class,
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations = genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores = genForlistDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForlistDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastores/{datastore_name}/versions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("datastore_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDatastoresRequest::getDatastoreName, (req, v) -> {
                req.setDatastoreName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags = genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances = genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags = genForlistInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForlistInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagsRequest, ListInstancesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagsRequest.class, ListInstancesByTagsResponse.class)
                .withName("ListInstancesByTags")
                .withUri("/v3/{project_id}/instances/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListInstancesByTagsRequestBody.class,
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForlistSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForlistSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword = genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetPasswordRequestBody.class,
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance = genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeInstanceRequestBody.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolume = genForresizeInstanceVolume();

    private static HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> genForresizeInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceVolumeRequest.class, ResizeInstanceVolumeResponse.class)
                .withName("ResizeInstanceVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/extend-volume")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeInstanceVolumeRequestBody.class,
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy = genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetBackupPolicyRequestBody.class,
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy = genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail = genForshowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForshowConfigurationDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationDetailRequest.class, ShowConfigurationDetailResponse.class)
                .withName("ShowConfigurationDetail")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration = genForshowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForshowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceConfigurationRequest.class, ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNode = genForshrinkInstanceNode();

    private static HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> genForshrinkInstanceNode() {
        // basic
        HttpRequestDef.Builder<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkInstanceNodeRequest.class, ShrinkInstanceNodeResponse.class)
                .withName("ShrinkInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/reduce-node")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShrinkInstanceNodeRequestBody.class,
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration = genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateConfigurationRequestBody.class,
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration = genForupdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForupdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceConfigurationRequest.class, UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceConfigurationRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName = genForupdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForupdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceNameRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup = genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion = genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

}
