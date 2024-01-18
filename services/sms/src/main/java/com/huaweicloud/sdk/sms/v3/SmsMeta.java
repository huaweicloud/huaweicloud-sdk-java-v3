package com.huaweicloud.sdk.sms.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sms.v3.model.CheckNetAclRequest;
import com.huaweicloud.sdk.sms.v3.model.CheckNetAclResponse;
import com.huaweicloud.sdk.sms.v3.model.CollectLogRequest;
import com.huaweicloud.sdk.sms.v3.model.CollectLogResponse;
import com.huaweicloud.sdk.sms.v3.model.CommandBody;
import com.huaweicloud.sdk.sms.v3.model.ConfigurationRequestBody;
import com.huaweicloud.sdk.sms.v3.model.ConsistencyResultRequestBody;
import com.huaweicloud.sdk.sms.v3.model.CreateMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.CreatePrivacyAgreementsRequest;
import com.huaweicloud.sdk.sms.v3.model.CreatePrivacyAgreementsResponse;
import com.huaweicloud.sdk.sms.v3.model.CreateTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.CreateTemplateReq;
import com.huaweicloud.sdk.sms.v3.model.CreateTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteIds;
import com.huaweicloud.sdk.sms.v3.model.DeleteMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteServerRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteServerResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteServersRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteServersResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTasksReq;
import com.huaweicloud.sdk.sms.v3.model.DeleteTasksRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTasksResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplatesRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplatesResponse;
import com.huaweicloud.sdk.sms.v3.model.DeletetemplatesReq;
import com.huaweicloud.sdk.sms.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.sms.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.sms.v3.model.ListErrorServersRequest;
import com.huaweicloud.sdk.sms.v3.model.ListErrorServersResponse;
import com.huaweicloud.sdk.sms.v3.model.ListMigprojectsRequest;
import com.huaweicloud.sdk.sms.v3.model.ListMigprojectsResponse;
import com.huaweicloud.sdk.sms.v3.model.ListServersRequest;
import com.huaweicloud.sdk.sms.v3.model.ListServersResponse;
import com.huaweicloud.sdk.sms.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.sms.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.sms.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.sms.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.sms.v3.model.MigProject;
import com.huaweicloud.sdk.sms.v3.model.NetworkCheckInfoRequestBody;
import com.huaweicloud.sdk.sms.v3.model.PostMigProjectBody;
import com.huaweicloud.sdk.sms.v3.model.PostSourceServerBody;
import com.huaweicloud.sdk.sms.v3.model.PostTask;
import com.huaweicloud.sdk.sms.v3.model.PutCopyStateReq;
import com.huaweicloud.sdk.sms.v3.model.PutDiskInfoReq;
import com.huaweicloud.sdk.sms.v3.model.PutSourceServerBody;
import com.huaweicloud.sdk.sms.v3.model.PutTaskReq;
import com.huaweicloud.sdk.sms.v3.model.RegisterServerRequest;
import com.huaweicloud.sdk.sms.v3.model.RegisterServerResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowCertKeyRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowCertKeyResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowCommandRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowCommandResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigSettingRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigSettingResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowConsistencyResultRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowConsistencyResultResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowOverviewRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowOverviewResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowPassphraseRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowPassphraseResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowPrivacyAgreementsRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowPrivacyAgreementsResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowServerRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowServerResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowSha256Request;
import com.huaweicloud.sdk.sms.v3.model.ShowSha256Response;
import com.huaweicloud.sdk.sms.v3.model.ShowTargetPasswordRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTargetPasswordResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowsSpeedLimitsRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowsSpeedLimitsResponse;
import com.huaweicloud.sdk.sms.v3.model.SpeedLimit;
import com.huaweicloud.sdk.sms.v3.model.UnlockTargetEcsRequest;
import com.huaweicloud.sdk.sms.v3.model.UnlockTargetEcsResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateCommandResultRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateCommandResultResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateConsistencyResultRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateConsistencyResultResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateCopyStateRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateCopyStateResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateDefaultMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateDefaultMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateDiskInfoRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateDiskInfoResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateNetworkCheckInfoRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateNetworkCheckInfoResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateServerNameRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateServerNameResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateSpeedRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateSpeedResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedReq;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskStatusReq;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskStatusRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskStatusResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTemplateReq;
import com.huaweicloud.sdk.sms.v3.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.UploadLogRequestBody;
import com.huaweicloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingRequest;
import com.huaweicloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingResponse;

@SuppressWarnings("unchecked")
public class SmsMeta {

    public static final HttpRequestDef<CheckNetAclRequest, CheckNetAclResponse> checkNetAcl = genForCheckNetAcl();

    private static HttpRequestDef<CheckNetAclRequest, CheckNetAclResponse> genForCheckNetAcl() {
        // basic
        HttpRequestDef.Builder<CheckNetAclRequest, CheckNetAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNetAclRequest.class, CheckNetAclResponse.class)
                .withName("CheckNetAcl")
                .withUri("/v3/tasks/{t_project_id}/networkacl/{t_network_id}/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("t_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getTProjectId, CheckNetAclRequest::setTProjectId));
        builder.<String>withRequestField("t_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getTNetworkId, CheckNetAclRequest::setTNetworkId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getRegionId, CheckNetAclRequest::setRegionId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getOsType, CheckNetAclRequest::setOsType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectLogRequest, CollectLogResponse> collectLog = genForCollectLog();

    private static HttpRequestDef<CollectLogRequest, CollectLogResponse> genForCollectLog() {
        // basic
        HttpRequestDef.Builder<CollectLogRequest, CollectLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CollectLogRequest.class, CollectLogResponse.class)
                .withName("CollectLog")
                .withUri("/v3/tasks/{task_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectLogRequest::getTaskId, CollectLogRequest::setTaskId));
        builder.<UploadLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadLogRequestBody.class),
            f -> f.withMarshaller(CollectLogRequest::getBody, CollectLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> createMigproject =
        genForCreateMigproject();

    private static HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> genForCreateMigproject() {
        // basic
        HttpRequestDef.Builder<CreateMigprojectRequest, CreateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigprojectRequest.class, CreateMigprojectResponse.class)
                .withName("CreateMigproject")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.<PostMigProjectBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMigProjectBody.class),
            f -> f.withMarshaller(CreateMigprojectRequest::getBody, CreateMigprojectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse> createPrivacyAgreements =
        genForCreatePrivacyAgreements();

    private static HttpRequestDef<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse> genForCreatePrivacyAgreements() {
        // basic
        HttpRequestDef.Builder<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrivacyAgreementsRequest.class, CreatePrivacyAgreementsResponse.class)
            .withName("CreatePrivacyAgreements")
            .withUri("/v3/privacy-agreements")
            .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePrivacyAgreementsResponse::getBody, CreatePrivacyAgreementsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.<PostTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostTask.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigproject =
        genForDeleteMigproject();

    private static HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> genForDeleteMigproject() {
        // basic
        HttpRequestDef.Builder<DeleteMigprojectRequest, DeleteMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMigprojectRequest.class, DeleteMigprojectResponse.class)
                .withName("DeleteMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMigprojectRequest::getMigProjectId, DeleteMigprojectRequest::setMigProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerRequest, DeleteServerResponse> deleteServer = genForDeleteServer();

    private static HttpRequestDef<DeleteServerRequest, DeleteServerResponse> genForDeleteServer() {
        // basic
        HttpRequestDef.Builder<DeleteServerRequest, DeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerRequest.class, DeleteServerResponse.class)
                .withName("DeleteServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerRequest::getSourceId, DeleteServerRequest::setSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers =
        genForDeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genForDeleteServers() {
        // basic
        HttpRequestDef.Builder<DeleteServersRequest, DeleteServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServersRequest.class, DeleteServersResponse.class)
                .withName("DeleteServers")
                .withUri("/v3/sources/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteIds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIds.class),
            f -> f.withMarshaller(DeleteServersRequest::getBody, DeleteServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> deleteTasks = genForDeleteTasks();

    private static HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> genForDeleteTasks() {
        // basic
        HttpRequestDef.Builder<DeleteTasksRequest, DeleteTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTasksRequest.class, DeleteTasksResponse.class)
                .withName("DeleteTasks")
                .withUri("/v3/tasks/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTasksReq.class),
            f -> f.withMarshaller(DeleteTasksRequest::getBody, DeleteTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getId, DeleteTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates =
        genForDeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genForDeleteTemplates() {
        // basic
        HttpRequestDef.Builder<DeleteTemplatesRequest, DeleteTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTemplatesRequest.class, DeleteTemplatesResponse.class)
                .withName("DeleteTemplates")
                .withUri("/v3/vm/templates/delete")
                .withContentType("application/json");

        // requests
        builder.<DeletetemplatesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeletetemplatesReq.class),
            f -> f.withMarshaller(DeleteTemplatesRequest::getBody, DeleteTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> listErrorServers =
        genForListErrorServers();

    private static HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> genForListErrorServers() {
        // basic
        HttpRequestDef.Builder<ListErrorServersRequest, ListErrorServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorServersRequest.class, ListErrorServersResponse.class)
                .withName("ListErrorServers")
                .withUri("/v3/errors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorServersRequest::getLimit, ListErrorServersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorServersRequest::getOffset, ListErrorServersRequest::setOffset));
        builder.<String>withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorServersRequest::getMigproject, ListErrorServersRequest::setMigproject));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorServersRequest::getEnterpriseProjectId,
                ListErrorServersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojects =
        genForListMigprojects();

    private static HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> genForListMigprojects() {
        // basic
        HttpRequestDef.Builder<ListMigprojectsRequest, ListMigprojectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigprojectsRequest.class, ListMigprojectsResponse.class)
                .withName("ListMigprojects")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigprojectsRequest::getLimit, ListMigprojectsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigprojectsRequest::getOffset, ListMigprojectsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForListServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForListServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.<ListServersRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServersRequest.StateEnum.class),
            f -> f.withMarshaller(ListServersRequest::getState, ListServersRequest::setState));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getName, ListServersRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getId, ListServersRequest::setId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getIp, ListServersRequest::setIp));
        builder.<String>withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMigproject, ListServersRequest::setMigproject));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, ListServersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getOffset, ListServersRequest::setOffset));
        builder.<ListServersRequest.MigrationCycleEnum>withRequestField("migration_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServersRequest.MigrationCycleEnum.class),
            f -> f.withMarshaller(ListServersRequest::getMigrationCycle, ListServersRequest::setMigrationCycle));
        builder.<Boolean>withRequestField("connected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListServersRequest::getConnected, ListServersRequest::setConnected));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getEnterpriseProjectId,
                ListServersRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("is_consistency_result_exist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListServersRequest::getIsConsistencyResultExist,
                ListServersRequest::setIsConsistencyResultExist));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.<ListTasksRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.StateEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getState, ListTasksRequest::setState));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getName, ListTasksRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getId, ListTasksRequest::setId));
        builder.<String>withRequestField("source_server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSourceServerId, ListTasksRequest::setSourceServerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEnterpriseProjectId, ListTasksRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, ListTemplatesRequest::setName));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getAvailabilityZone,
                ListTemplatesRequest::setAvailabilityZone));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getRegion, ListTemplatesRequest::setRegion));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, ListTemplatesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, ListTemplatesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerRequest, RegisterServerResponse> registerServer =
        genForRegisterServer();

    private static HttpRequestDef<RegisterServerRequest, RegisterServerResponse> genForRegisterServer() {
        // basic
        HttpRequestDef.Builder<RegisterServerRequest, RegisterServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterServerRequest.class, RegisterServerResponse.class)
                .withName("RegisterServer")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.<PostSourceServerBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSourceServerBody.class),
            f -> f.withMarshaller(RegisterServerRequest::getBody, RegisterServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> showCertKey = genForShowCertKey();

    private static HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> genForShowCertKey() {
        // basic
        HttpRequestDef.Builder<ShowCertKeyRequest, ShowCertKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertKeyRequest.class, ShowCertKeyResponse.class)
                .withName("ShowCertKey")
                .withUri("/v3/tasks/{task_id}/certkey")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertKeyRequest::getTaskId, ShowCertKeyRequest::setTaskId));
        builder.<Boolean>withRequestField("enable_ca_cert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCertKeyRequest::getEnableCaCert, ShowCertKeyRequest::setEnableCaCert));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommandRequest, ShowCommandResponse> showCommand = genForShowCommand();

    private static HttpRequestDef<ShowCommandRequest, ShowCommandResponse> genForShowCommand() {
        // basic
        HttpRequestDef.Builder<ShowCommandRequest, ShowCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommandRequest.class, ShowCommandResponse.class)
                .withName("ShowCommand")
                .withUri("/v3/sources/{server_id}/command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommandRequest::getServerId, ShowCommandRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigSettingRequest, ShowConfigSettingResponse> showConfigSetting =
        genForShowConfigSetting();

    private static HttpRequestDef<ShowConfigSettingRequest, ShowConfigSettingResponse> genForShowConfigSetting() {
        // basic
        HttpRequestDef.Builder<ShowConfigSettingRequest, ShowConfigSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigSettingRequest.class, ShowConfigSettingResponse.class)
                .withName("ShowConfigSetting")
                .withUri("/v3/tasks/{task_id}/configuration-setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigSettingRequest::getTaskId, ShowConfigSettingRequest::setTaskId));
        builder.<String>withRequestField("config_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigSettingRequest::getConfigKey, ShowConfigSettingRequest::setConfigKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsistencyResultRequest, ShowConsistencyResultResponse> showConsistencyResult =
        genForShowConsistencyResult();

    private static HttpRequestDef<ShowConsistencyResultRequest, ShowConsistencyResultResponse> genForShowConsistencyResult() {
        // basic
        HttpRequestDef.Builder<ShowConsistencyResultRequest, ShowConsistencyResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConsistencyResultRequest.class, ShowConsistencyResultResponse.class)
            .withName("ShowConsistencyResult")
            .withUri("/v3/tasks/{task_id}/consistency-result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsistencyResultRequest::getTaskId, ShowConsistencyResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> showMigproject =
        genForShowMigproject();

    private static HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> genForShowMigproject() {
        // basic
        HttpRequestDef.Builder<ShowMigprojectRequest, ShowMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigprojectRequest.class, ShowMigprojectResponse.class)
                .withName("ShowMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigprojectRequest::getMigProjectId, ShowMigprojectRequest::setMigProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForShowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForShowOverview() {
        // basic
        HttpRequestDef.Builder<ShowOverviewRequest, ShowOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOverviewRequest.class, ShowOverviewResponse.class)
                .withName("ShowOverview")
                .withUri("/v3/sources/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPassphraseRequest, ShowPassphraseResponse> showPassphrase =
        genForShowPassphrase();

    private static HttpRequestDef<ShowPassphraseRequest, ShowPassphraseResponse> genForShowPassphrase() {
        // basic
        HttpRequestDef.Builder<ShowPassphraseRequest, ShowPassphraseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPassphraseRequest.class, ShowPassphraseResponse.class)
                .withName("ShowPassphrase")
                .withUri("/v3/tasks/{task_id}/passphrase")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPassphraseRequest::getTaskId, ShowPassphraseRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse> showPrivacyAgreements =
        genForShowPrivacyAgreements();

    private static HttpRequestDef<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse> genForShowPrivacyAgreements() {
        // basic
        HttpRequestDef.Builder<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPrivacyAgreementsRequest.class, ShowPrivacyAgreementsResponse.class)
            .withName("ShowPrivacyAgreements")
            .withUri("/v3/privacy-agreements")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForShowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForShowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getSourceId, ShowServerRequest::setSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSha256Request, ShowSha256Response> showSha256 = genForShowSha256();

    private static HttpRequestDef<ShowSha256Request, ShowSha256Response> genForShowSha256() {
        // basic
        HttpRequestDef.Builder<ShowSha256Request, ShowSha256Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSha256Request.class, ShowSha256Response.class)
                .withName("ShowSha256")
                .withUri("/v3/sha256/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSha256Request::getKey, ShowSha256Request::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTargetPasswordRequest, ShowTargetPasswordResponse> showTargetPassword =
        genForShowTargetPassword();

    private static HttpRequestDef<ShowTargetPasswordRequest, ShowTargetPasswordResponse> genForShowTargetPassword() {
        // basic
        HttpRequestDef.Builder<ShowTargetPasswordRequest, ShowTargetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTargetPasswordRequest.class, ShowTargetPasswordResponse.class)
                .withName("ShowTargetPassword")
                .withUri("/v3/vm/templates/{id}/target-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetPasswordRequest::getId, ShowTargetPasswordRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForShowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForShowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getId, ShowTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimits =
        genForShowsSpeedLimits();

    private static HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> genForShowsSpeedLimits() {
        // basic
        HttpRequestDef.Builder<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowsSpeedLimitsRequest.class, ShowsSpeedLimitsResponse.class)
                .withName("ShowsSpeedLimits")
                .withUri("/v3/tasks/{task_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowsSpeedLimitsRequest::getTaskId, ShowsSpeedLimitsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockTargetEcsRequest, UnlockTargetEcsResponse> unlockTargetEcs =
        genForUnlockTargetEcs();

    private static HttpRequestDef<UnlockTargetEcsRequest, UnlockTargetEcsResponse> genForUnlockTargetEcs() {
        // basic
        HttpRequestDef.Builder<UnlockTargetEcsRequest, UnlockTargetEcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockTargetEcsRequest.class, UnlockTargetEcsResponse.class)
                .withName("UnlockTargetEcs")
                .withUri("/v3/tasks/{task_id}/unlock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockTargetEcsRequest::getTaskId, UnlockTargetEcsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResult =
        genForUpdateCommandResult();

    private static HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> genForUpdateCommandResult() {
        // basic
        HttpRequestDef.Builder<UpdateCommandResultRequest, UpdateCommandResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCommandResultRequest.class, UpdateCommandResultResponse.class)
                .withName("UpdateCommandResult")
                .withUri("/v3/sources/{server_id}/command_result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCommandResultRequest::getServerId, UpdateCommandResultRequest::setServerId));
        builder.<CommandBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommandBody.class),
            f -> f.withMarshaller(UpdateCommandResultRequest::getBody, UpdateCommandResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConsistencyResultRequest, UpdateConsistencyResultResponse> updateConsistencyResult =
        genForUpdateConsistencyResult();

    private static HttpRequestDef<UpdateConsistencyResultRequest, UpdateConsistencyResultResponse> genForUpdateConsistencyResult() {
        // basic
        HttpRequestDef.Builder<UpdateConsistencyResultRequest, UpdateConsistencyResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateConsistencyResultRequest.class, UpdateConsistencyResultResponse.class)
            .withName("UpdateConsistencyResult")
            .withUri("/v3/tasks/{task_id}/consistency-result")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsistencyResultRequest::getTaskId,
                UpdateConsistencyResultRequest::setTaskId));
        builder.<ConsistencyResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConsistencyResultRequestBody.class),
            f -> f.withMarshaller(UpdateConsistencyResultRequest::getBody, UpdateConsistencyResultRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateConsistencyResultResponse::getBody, UpdateConsistencyResultResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyState =
        genForUpdateCopyState();

    private static HttpRequestDef<UpdateCopyStateRequest, UpdateCopyStateResponse> genForUpdateCopyState() {
        // basic
        HttpRequestDef.Builder<UpdateCopyStateRequest, UpdateCopyStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCopyStateRequest.class, UpdateCopyStateResponse.class)
                .withName("UpdateCopyState")
                .withUri("/v3/sources/{source_id}/changestate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCopyStateRequest::getSourceId, UpdateCopyStateRequest::setSourceId));
        builder.<PutCopyStateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCopyStateReq.class),
            f -> f.withMarshaller(UpdateCopyStateRequest::getBody, UpdateCopyStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigproject =
        genForUpdateDefaultMigproject();

    private static HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> genForUpdateDefaultMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDefaultMigprojectRequest.class, UpdateDefaultMigprojectResponse.class)
            .withName("UpdateDefaultMigproject")
            .withUri("/v3/migprojects/{mig_project_id}/default")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDefaultMigprojectRequest::getMigProjectId,
                UpdateDefaultMigprojectRequest::setMigProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfo =
        genForUpdateDiskInfo();

    private static HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> genForUpdateDiskInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDiskInfoRequest, UpdateDiskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDiskInfoRequest.class, UpdateDiskInfoResponse.class)
                .withName("UpdateDiskInfo")
                .withUri("/v3/sources/{source_id}/diskinfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDiskInfoRequest::getSourceId, UpdateDiskInfoRequest::setSourceId));
        builder.<PutDiskInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutDiskInfoReq.class),
            f -> f.withMarshaller(UpdateDiskInfoRequest::getBody, UpdateDiskInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigproject =
        genForUpdateMigproject();

    private static HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> genForUpdateMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateMigprojectRequest, UpdateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMigprojectRequest.class, UpdateMigprojectResponse.class)
                .withName("UpdateMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMigprojectRequest::getMigProjectId, UpdateMigprojectRequest::setMigProjectId));
        builder.<MigProject>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigProject.class),
            f -> f.withMarshaller(UpdateMigprojectRequest::getBody, UpdateMigprojectRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMigprojectResponse::getBody, UpdateMigprojectResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> updateNetworkCheckInfo =
        genForUpdateNetworkCheckInfo();

    private static HttpRequestDef<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> genForUpdateNetworkCheckInfo() {
        // basic
        HttpRequestDef.Builder<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateNetworkCheckInfoRequest.class, UpdateNetworkCheckInfoResponse.class)
            .withName("UpdateNetworkCheckInfo")
            .withUri("/v3/{task_id}/update-network-check-info")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNetworkCheckInfoRequest::getTaskId, UpdateNetworkCheckInfoRequest::setTaskId));
        builder.<NetworkCheckInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkCheckInfoRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkCheckInfoRequest::getBody, UpdateNetworkCheckInfoRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNetworkCheckInfoResponse::getBody, UpdateNetworkCheckInfoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> updateServerName =
        genForUpdateServerName();

    private static HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> genForUpdateServerName() {
        // basic
        HttpRequestDef.Builder<UpdateServerNameRequest, UpdateServerNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServerNameRequest.class, UpdateServerNameResponse.class)
                .withName("UpdateServerName")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getSourceId, UpdateServerNameRequest::setSourceId));
        builder.<PutSourceServerBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutSourceServerBody.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getBody, UpdateServerNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeed = genForUpdateSpeed();

    private static HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> genForUpdateSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateSpeedRequest, UpdateSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSpeedRequest.class, UpdateSpeedResponse.class)
                .withName("UpdateSpeed")
                .withUri("/v3/tasks/{task_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpeedRequest::getTaskId, UpdateSpeedRequest::setTaskId));
        builder.<SpeedLimit>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpeedLimit.class),
            f -> f.withMarshaller(UpdateSpeedRequest::getBody, UpdateSpeedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<PutTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutTaskReq.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTaskResponse::getBody, UpdateTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeed =
        genForUpdateTaskSpeed();

    private static HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> genForUpdateTaskSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskSpeedRequest.class, UpdateTaskSpeedResponse.class)
                .withName("UpdateTaskSpeed")
                .withUri("/v3/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getTaskId, UpdateTaskSpeedRequest::setTaskId));
        builder.<UpdateTaskSpeedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTaskSpeedReq.class),
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getBody, UpdateTaskSpeedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatus =
        genForUpdateTaskStatus();

    private static HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> genForUpdateTaskStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTaskStatusRequest, UpdateTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskStatusRequest.class, UpdateTaskStatusResponse.class)
                .withName("UpdateTaskStatus")
                .withUri("/v3/tasks/{task_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTaskId, UpdateTaskStatusRequest::setTaskId));
        builder.<UpdateTaskStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskStatusReq.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getBody, UpdateTaskStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForUpdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForUpdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getId, UpdateTemplateRequest::setId));
        builder.<UpdateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTemplateReq.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, UpdateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSetting =
        genForUploadSpecialConfigurationSetting();

    private static HttpRequestDef<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> genForUploadSpecialConfigurationSetting() {
        // basic
        HttpRequestDef.Builder<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadSpecialConfigurationSettingRequest.class,
                    UploadSpecialConfigurationSettingResponse.class)
                .withName("UploadSpecialConfigurationSetting")
                .withUri("/v3/tasks/{task_id}/configuration-setting")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadSpecialConfigurationSettingRequest::getTaskId,
                UploadSpecialConfigurationSettingRequest::setTaskId));
        builder.<ConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationRequestBody.class),
            f -> f.withMarshaller(UploadSpecialConfigurationSettingRequest::getBody,
                UploadSpecialConfigurationSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigRequest, ShowConfigResponse> showConfig = genForShowConfig();

    private static HttpRequestDef<ShowConfigRequest, ShowConfigResponse> genForShowConfig() {
        // basic
        HttpRequestDef.Builder<ShowConfigRequest, ShowConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigRequest.class, ShowConfigResponse.class)
                .withName("ShowConfig")
                .withUri("/v3/config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForListApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForListApiVersion() {
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

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, ShowApiVersionRequest::setVersion));

        // response

        return builder.build();
    }

}
