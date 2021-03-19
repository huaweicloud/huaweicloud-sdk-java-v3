package com.huaweicloud.sdk.sms.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sms.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class SmsMeta {

    public static final HttpRequestDef<CheckTargetRequest, CheckTargetResponse> checkTarget = genForcheckTarget();

    private static HttpRequestDef<CheckTargetRequest, CheckTargetResponse> genForcheckTarget() {
        // basic
        HttpRequestDef.Builder<CheckTargetRequest, CheckTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTargetRequest.class, CheckTargetResponse.class)
                .withName("CheckTarget")
                .withUri("/v3/targetcheck")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            ChecktargetReq.class,
            f -> f.withMarshaller(CheckTargetRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> createMigproject = genForcreateMigproject();

    private static HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> genForcreateMigproject() {
        // basic
        HttpRequestDef.Builder<CreateMigprojectRequest, CreateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigprojectRequest.class, CreateMigprojectResponse.class)
                .withName("CreateMigproject")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostMigProjectBody.class,
            f -> f.withMarshaller(CreateMigprojectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMigprojectResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostTask.class,
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate = genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTemplateReq.class,
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigproject = genFordeleteMigproject();

    private static HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> genFordeleteMigproject() {
        // basic
        HttpRequestDef.Builder<DeleteMigprojectRequest, DeleteMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMigprojectRequest.class, DeleteMigprojectResponse.class)
                .withName("DeleteMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerRequest, DeleteServerResponse> deleteServer = genFordeleteServer();

    private static HttpRequestDef<DeleteServerRequest, DeleteServerResponse> genFordeleteServer() {
        // basic
        HttpRequestDef.Builder<DeleteServerRequest, DeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerRequest.class, DeleteServerResponse.class)
                .withName("DeleteServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServerRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers = genFordeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genFordeleteServers() {
        // basic
        HttpRequestDef.Builder<DeleteServersRequest, DeleteServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServersRequest.class, DeleteServersResponse.class)
                .withName("DeleteServers")
                .withUri("/v3/sources/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteIds.class,
            f -> f.withMarshaller(DeleteServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> deleteTasks = genFordeleteTasks();

    private static HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> genFordeleteTasks() {
        // basic
        HttpRequestDef.Builder<DeleteTasksRequest, DeleteTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTasksRequest.class, DeleteTasksResponse.class)
                .withName("DeleteTasks")
                .withUri("/v3/tasks/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteTasksReq.class,
            f -> f.withMarshaller(DeleteTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate = genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates = genFordeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genFordeleteTemplates() {
        // basic
        HttpRequestDef.Builder<DeleteTemplatesRequest, DeleteTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTemplatesRequest.class, DeleteTemplatesResponse.class)
                .withName("DeleteTemplates")
                .withUri("/v3/vm/templates/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            DeletetemplatesReq.class,
            f -> f.withMarshaller(DeleteTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> listErrorServers = genForlistErrorServers();

    private static HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> genForlistErrorServers() {
        // basic
        HttpRequestDef.Builder<ListErrorServersRequest, ListErrorServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorServersRequest.class, ListErrorServersResponse.class)
                .withName("ListErrorServers")
                .withUri("/v3/errors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListErrorServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListErrorServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListErrorServersRequest::getMigproject, (req, v) -> {
                req.setMigproject(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListErrorServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojects = genForlistMigprojects();

    private static HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> genForlistMigprojects() {
        // basic
        HttpRequestDef.Builder<ListMigprojectsRequest, ListMigprojectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigprojectsRequest.class, ListMigprojectsResponse.class)
                .withName("ListMigprojects")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMigprojectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMigprojectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForlistServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForlistServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListServersRequest.StateEnum.class,
            f -> f.withMarshaller(ListServersRequest::getState, (req, v) -> {
                req.setState(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );
        builder.withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getMigproject, (req, v) -> {
                req.setMigproject(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("migration_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getMigrationCycle, (req, v) -> {
                req.setMigrationCycle(v);
            })
        );
        builder.withRequestField("connected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListServersRequest::getConnected, (req, v) -> {
                req.setConnected(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForlistTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForlistTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListTasksRequest.StateEnum.class,
            f -> f.withMarshaller(ListTasksRequest::getState, (req, v) -> {
                req.setState(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTasksRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTasksRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("source_server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTasksRequest::getSourceServerId, (req, v) -> {
                req.setSourceServerId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTasksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates = genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerRequest, RegisterServerResponse> registerServer = genForregisterServer();

    private static HttpRequestDef<RegisterServerRequest, RegisterServerResponse> genForregisterServer() {
        // basic
        HttpRequestDef.Builder<RegisterServerRequest, RegisterServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterServerRequest.class, RegisterServerResponse.class)
                .withName("RegisterServer")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostSourceServerBody.class,
            f -> f.withMarshaller(RegisterServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> showCertKey = genForshowCertKey();

    private static HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> genForshowCertKey() {
        // basic
        HttpRequestDef.Builder<ShowCertKeyRequest, ShowCertKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertKeyRequest.class, ShowCertKeyResponse.class)
                .withName("ShowCertKey")
                .withUri("/v3/tasks/{task_id}/certkey")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCertKeyRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowCommandRequest, ShowCommandResponse> showCommand = genForshowCommand();

    private static HttpRequestDef<ShowCommandRequest, ShowCommandResponse> genForshowCommand() {
        // basic
        HttpRequestDef.Builder<ShowCommandRequest, ShowCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommandRequest.class, ShowCommandResponse.class)
                .withName("ShowCommand")
                .withUri("/v3/sources/{server_id}/command")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommandRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> showMigproject = genForshowMigproject();

    private static HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> genForshowMigproject() {
        // basic
        HttpRequestDef.Builder<ShowMigprojectRequest, ShowMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigprojectRequest.class, ShowMigprojectResponse.class)
                .withName("ShowMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForshowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForshowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowServerRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForshowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForshowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForshowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForshowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimits = genForshowsSpeedLimits();

    private static HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> genForshowsSpeedLimits() {
        // basic
        HttpRequestDef.Builder<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowsSpeedLimitsRequest.class, ShowsSpeedLimitsResponse.class)
                .withName("ShowsSpeedLimits")
                .withUri("/v3/tasks/{task_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowsSpeedLimitsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowsSpeedLimitsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(SpeedLimit.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResult = genForupdateCommandResult();

    private static HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> genForupdateCommandResult() {
        // basic
        HttpRequestDef.Builder<UpdateCommandResultRequest, UpdateCommandResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCommandResultRequest.class, UpdateCommandResultResponse.class)
                .withName("UpdateCommandResult")
                .withUri("/v3/sources/{server_id}/command-result")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCommandResultRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CommandBody.class,
            f -> f.withMarshaller(UpdateCommandResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigproject = genForupdateDefaultMigproject();

    private static HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> genForupdateDefaultMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDefaultMigprojectRequest.class, UpdateDefaultMigprojectResponse.class)
                .withName("UpdateDefaultMigproject")
                .withUri("/v3/migprojects/{mig_project_id}/default")
                .withContentType("application/json");

        // requests
        builder.withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDefaultMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfo = genForupdateDiskInfo();

    private static HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> genForupdateDiskInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDiskInfoRequest, UpdateDiskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDiskInfoRequest.class, UpdateDiskInfoResponse.class)
                .withName("UpdateDiskInfo")
                .withUri("/v3/sources/{source_id}/diskinfo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDiskInfoRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            PutDiskInfoReq.class,
            f -> f.withMarshaller(UpdateDiskInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigproject = genForupdateMigproject();

    private static HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> genForupdateMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateMigprojectRequest, UpdateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMigprojectRequest.class, UpdateMigprojectResponse.class)
                .withName("UpdateMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            MigProject.class,
            f -> f.withMarshaller(UpdateMigprojectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMigprojectResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> updateServerName = genForupdateServerName();

    private static HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> genForupdateServerName() {
        // basic
        HttpRequestDef.Builder<UpdateServerNameRequest, UpdateServerNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServerNameRequest.class, UpdateServerNameResponse.class)
                .withName("UpdateServerName")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateServerNameRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PutSourceServerBody.class,
            f -> f.withMarshaller(UpdateServerNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeed = genForupdateSpeed();

    private static HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> genForupdateSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateSpeedRequest, UpdateSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSpeedRequest.class, UpdateSpeedResponse.class)
                .withName("UpdateSpeed")
                .withUri("/v3/tasks/{task_id}/speedlimit")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpeedRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SpeedLimit.class,
            f -> f.withMarshaller(UpdateSpeedRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeed = genForupdateTaskSpeed();

    private static HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> genForupdateTaskSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskSpeedRequest.class, UpdateTaskSpeedResponse.class)
                .withName("UpdateTaskSpeed")
                .withUri("/v3/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateTaskSpeedReq.class,
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatus = genForupdateTaskStatus();

    private static HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> genForupdateTaskStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTaskStatusRequest, UpdateTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskStatusRequest.class, UpdateTaskStatusResponse.class)
                .withName("UpdateTaskStatus")
                .withUri("/v3/tasks/{task_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateTaskStatusReq.class,
            f -> f.withMarshaller(UpdateTaskStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate = genForupdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForupdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateTemplateReq.class,
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

}
