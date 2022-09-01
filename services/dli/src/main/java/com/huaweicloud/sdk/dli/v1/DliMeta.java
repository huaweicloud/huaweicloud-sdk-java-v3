package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dli.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class DliMeta {

    public static final HttpRequestDef<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse> createFlinkTemplate =
        genForcreateFlinkTemplate();

    private static HttpRequestDef<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse> genForcreateFlinkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkTemplateRequest.class, CreateFlinkTemplateResponse.class)
                .withName("CreateFlinkTemplate")
                .withUri("/v1.0/{project_id}/streaming/job-templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateFlinkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobleValueRequest, CreateGlobleValueResponse> createGlobleValue =
        genForcreateGlobleValue();

    private static HttpRequestDef<CreateGlobleValueRequest, CreateGlobleValueResponse> genForcreateGlobleValue() {
        // basic
        HttpRequestDef.Builder<CreateGlobleValueRequest, CreateGlobleValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGlobleValueRequest.class, CreateGlobleValueResponse.class)
                .withName("CreateGlobleValue")
                .withUri("/v1.0/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<CreateGlobalValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalValueReq.class),
            f -> f.withMarshaller(CreateGlobleValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse> deleteFlinkTemplate =
        genFordeleteFlinkTemplate();

    private static HttpRequestDef<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse> genFordeleteFlinkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteFlinkTemplateRequest.class, DeleteFlinkTemplateResponse.class)
            .withName("DeleteFlinkTemplate")
            .withUri("/v1.0/{project_id}/streaming/job-templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteFlinkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalValueRequest, DeleteGlobalValueResponse> deleteGlobalValue =
        genFordeleteGlobalValue();

    private static HttpRequestDef<DeleteGlobalValueRequest, DeleteGlobalValueResponse> genFordeleteGlobalValue() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalValueRequest, DeleteGlobalValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGlobalValueRequest.class, DeleteGlobalValueResponse.class)
                .withName("DeleteGlobalValue")
                .withUri("/v1.0/{project_id}/variables/{var_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("var_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalValueRequest::getVarName, (req, v) -> {
                req.setVarName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse> listFlinkTemplates =
        genForlistFlinkTemplates();

    private static HttpRequestDef<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse> genForlistFlinkTemplates() {
        // basic
        HttpRequestDef.Builder<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkTemplatesRequest.class, ListFlinkTemplatesResponse.class)
                .withName("ListFlinkTemplates")
                .withUri("/v1.0/{project_id}/streaming/job-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkTemplatesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkTemplatesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalValuesRequest, ListGlobalValuesResponse> listGlobalValues =
        genForlistGlobalValues();

    private static HttpRequestDef<ListGlobalValuesRequest, ListGlobalValuesResponse> genForlistGlobalValues() {
        // basic
        HttpRequestDef.Builder<ListGlobalValuesRequest, ListGlobalValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGlobalValuesRequest.class, ListGlobalValuesResponse.class)
                .withName("ListGlobalValues")
                .withUri("/v1.0/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalValuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalValuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse> updateFlinkTemplate =
        genForupdateFlinkTemplate();

    private static HttpRequestDef<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse> genForupdateFlinkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlinkTemplateRequest.class, UpdateFlinkTemplateResponse.class)
                .withName("UpdateFlinkTemplate")
                .withUri("/v1.0/{project_id}/streaming/job-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTemplateReq.class),
            f -> f.withMarshaller(UpdateFlinkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalValueRequest, UpdateGlobalValueResponse> updateGlobalValue =
        genForupdateGlobalValue();

    private static HttpRequestDef<UpdateGlobalValueRequest, UpdateGlobalValueResponse> genForupdateGlobalValue() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalValueRequest, UpdateGlobalValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGlobalValueRequest.class, UpdateGlobalValueResponse.class)
                .withName("UpdateGlobalValue")
                .withUri("/v1.0/{project_id}/variables/{var_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("var_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalValueRequest::getVarName, (req, v) -> {
                req.setVarName(v);
            }));
        builder.<UpdateGlobalValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalValueReq.class),
            f -> f.withMarshaller(UpdateGlobalValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse> associateConnectionQueue =
        genForassociateConnectionQueue();

    private static HttpRequestDef<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse> genForassociateConnectionQueue() {
        // basic
        HttpRequestDef.Builder<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AssociateConnectionQueueRequest.class, AssociateConnectionQueueResponse.class)
                .withName("AssociateConnectionQueue")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/associate-queue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateConnectionQueueRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<AssociateConnectionQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateConnectionQueueReq.class),
            f -> f.withMarshaller(AssociateConnectionQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePool =
        genForassociateQueueToElasticResourcePool();

    private static HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> genForassociateQueueToElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateQueueToElasticResourcePoolRequest.class,
                    AssociateQueueToElasticResourcePoolResponse.class)
                .withName("AssociateQueueToElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<AssociateQueueToElasticResourcePoolIfno>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateQueueToElasticResourcePoolIfno.class),
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReport =
        genForchangeFlinkJobStatusReport();

    private static HttpRequestDef<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> genForchangeFlinkJobStatusReport() {
        // basic
        HttpRequestDef.Builder<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeFlinkJobStatusReportRequest.class,
                    ChangeFlinkJobStatusReportResponse.class)
                .withName("ChangeFlinkJobStatusReport")
                .withUri("/v1/{project_id}/edgesrv/job-report")
                .withContentType("application/json");

        // requests
        builder.<IefFlinkJobStatusReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefFlinkJobStatusReportReq.class),
            f -> f.withMarshaller(ChangeFlinkJobStatusReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnection =
        genForcreateDatasourceConnection();

    private static HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> genForcreateDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDatasourceConnectionRequest.class,
                    CreateDatasourceConnectionResponse.class)
                .withName("CreateDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection")
                .withContentType("application/json");

        // requests
        builder.<CreateDatasourceConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatasourceConnectionReq.class),
            f -> f.withMarshaller(CreateDatasourceConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> createElasticResourcePool =
        genForcreateElasticResourcePool();

    private static HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> genForcreateElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateElasticResourcePoolRequest.class,
                    CreateElasticResourcePoolResponse.class)
                .withName("CreateElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools")
                .withContentType("application/json");

        // requests
        builder.<CreateElasticResourcePoolInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateElasticResourcePoolInfo.class),
            f -> f.withMarshaller(CreateElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnection =
        genForcreateEnhancedConnection();

    private static HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> genForcreateEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateEnhancedConnectionRequest.class, CreateEnhancedConnectionResponse.class)
                .withName("CreateEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections")
                .withContentType("application/json");

        // requests
        builder.<CreateEnhancedConnectionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnhancedConnectionsReq.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkJarRequest, CreateFlinkJarResponse> createFlinkJar =
        genForcreateFlinkJar();

    private static HttpRequestDef<CreateFlinkJarRequest, CreateFlinkJarResponse> genForcreateFlinkJar() {
        // basic
        HttpRequestDef.Builder<CreateFlinkJarRequest, CreateFlinkJarResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkJarRequest.class, CreateFlinkJarResponse.class)
                .withName("CreateFlinkJar")
                .withUri("/v1.0/{project_id}/streaming/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateFlinkdefinedJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkdefinedJobsReq.class),
            f -> f.withMarshaller(CreateFlinkJarRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlRequest, CreateFlinkSqlResponse> createFlinkSql =
        genForcreateFlinkSql();

    private static HttpRequestDef<CreateFlinkSqlRequest, CreateFlinkSqlResponse> genForcreateFlinkSql() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSqlRequest, CreateFlinkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkSqlRequest.class, CreateFlinkSqlResponse.class)
                .withName("CreateFlinkSql")
                .withUri("/v1.0/{project_id}/streaming/sql-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateSQLJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSQLJobReq.class),
            f -> f.withMarshaller(CreateFlinkSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannel =
        genForcreateIefMessageChannel();

    private static HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> genForcreateIefMessageChannel() {
        // basic
        HttpRequestDef.Builder<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefMessageChannelRequest.class, CreateIefMessageChannelResponse.class)
            .withName("CreateIefMessageChannel")
            .withUri("/v1/{project_id}/edgesrv/message-channel")
            .withContentType("application/json");

        // requests
        builder.<CreateIefMessageChannelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIefMessageChannelReq.class),
            f -> f.withMarshaller(CreateIefMessageChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEvents =
        genForcreateIefSystemEvents();

    private static HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> genForcreateIefSystemEvents() {
        // basic
        HttpRequestDef.Builder<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefSystemEventsRequest.class, CreateIefSystemEventsResponse.class)
            .withName("CreateIefSystemEvents")
            .withUri("/v1/{project_id}/edgesrv/system-events")
            .withContentType("application/json");

        // requests
        builder.<IefSystemEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefSystemEventsReq.class),
            f -> f.withMarshaller(CreateIefSystemEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamGraphRequest, CreateStreamGraphResponse> createStreamGraph =
        genForcreateStreamGraph();

    private static HttpRequestDef<CreateStreamGraphRequest, CreateStreamGraphResponse> genForcreateStreamGraph() {
        // basic
        HttpRequestDef.Builder<CreateStreamGraphRequest, CreateStreamGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStreamGraphRequest.class, CreateStreamGraphResponse.class)
                .withName("CreateStreamGraph")
                .withUri("/v3/{project_id}/streaming/jobs/{job_id}/gen-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStreamGraphRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<GenStreamGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenStreamGraphReq.class),
            f -> f.withMarshaller(CreateStreamGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse> deleteBatchFlinkJob =
        genFordeleteBatchFlinkJob();

    private static HttpRequestDef<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse> genFordeleteBatchFlinkJob() {
        // basic
        HttpRequestDef.Builder<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteBatchFlinkJobRequest.class, DeleteBatchFlinkJobResponse.class)
                .withName("DeleteBatchFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteFlinkJobInBatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFlinkJobInBatch.class),
            f -> f.withMarshaller(DeleteBatchFlinkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnection =
        genFordeleteDatasourceConnection();

    private static HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> genFordeleteDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatasourceConnectionRequest.class,
                    DeleteDatasourceConnectionResponse.class)
                .withName("DeleteDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatasourceConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> deleteElasticResourcePool =
        genFordeleteElasticResourcePool();

    private static HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> genFordeleteElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteElasticResourcePoolRequest.class,
                    DeleteElasticResourcePoolResponse.class)
                .withName("DeleteElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnection =
        genFordeleteEnhancedConnection();

    private static HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> genFordeleteEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEnhancedConnectionRequest.class,
                    DeleteEnhancedConnectionResponse.class)
                .withName("DeleteEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkRequest, DeleteFlinkResponse> deleteFlink = genFordeleteFlink();

    private static HttpRequestDef<DeleteFlinkRequest, DeleteFlinkResponse> genFordeleteFlink() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkRequest, DeleteFlinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlinkRequest.class, DeleteFlinkResponse.class)
                .withName("DeleteFlink")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteFlinkRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse> disassociateConnectionQueue =
        genFordisassociateConnectionQueue();

    private static HttpRequestDef<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse> genFordisassociateConnectionQueue() {
        // basic
        HttpRequestDef.Builder<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateConnectionQueueRequest.class,
                    DisassociateConnectionQueueResponse.class)
                .withName("DisassociateConnectionQueue")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/disassociate-queue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateConnectionQueueRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<DisassociateConnectionQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateConnectionQueueReq.class),
            f -> f.withMarshaller(DisassociateConnectionQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFlinkJobRequest, ExportFlinkJobResponse> exportFlinkJob =
        genForexportFlinkJob();

    private static HttpRequestDef<ExportFlinkJobRequest, ExportFlinkJobResponse> genForexportFlinkJob() {
        // basic
        HttpRequestDef.Builder<ExportFlinkJobRequest, ExportFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportFlinkJobRequest.class, ExportFlinkJobResponse.class)
                .withName("ExportFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/export")
                .withContentType("application/json");

        // requests
        builder.<ExportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportReq.class),
            f -> f.withMarshaller(ExportFlinkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFlinkJobRequest, ImportFlinkJobResponse> importFlinkJob =
        genForimportFlinkJob();

    private static HttpRequestDef<ImportFlinkJobRequest, ImportFlinkJobResponse> genForimportFlinkJob() {
        // basic
        HttpRequestDef.Builder<ImportFlinkJobRequest, ImportFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportFlinkJobRequest.class, ImportFlinkJobResponse.class)
                .withName("ImportFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/import")
                .withContentType("application/json");

        // requests
        builder.<ImportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportReq.class),
            f -> f.withMarshaller(ImportFlinkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnections =
        genForlistDatasourceConnections();

    private static HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> genForlistDatasourceConnections() {
        // basic
        HttpRequestDef.Builder<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatasourceConnectionsRequest.class,
                    ListDatasourceConnectionsResponse.class)
                .withName("ListDatasourceConnections")
                .withUri("/v2.0/{project_id}/datasource-connection")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueues =
        genForlistElasticResourcePoolQueues();

    private static HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> genForlistElasticResourcePoolQueues() {
        // basic
        HttpRequestDef.Builder<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListElasticResourcePoolQueuesRequest.class,
                    ListElasticResourcePoolQueuesResponse.class)
                .withName("ListElasticResourcePoolQueues")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> listElasticResourcePools =
        genForlistElasticResourcePools();

    private static HttpRequestDef<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> genForlistElasticResourcePools() {
        // basic
        HttpRequestDef.Builder<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListElasticResourcePoolsRequest.class, ListElasticResourcePoolsResponse.class)
                .withName("ListElasticResourcePools")
                .withUri("/v3/{project_id}/elastic-resource-pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListElasticResourcePoolsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListElasticResourcePoolsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnections =
        genForlistEnhancedConnections();

    private static HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> genForlistEnhancedConnections() {
        // basic
        HttpRequestDef.Builder<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnhancedConnectionsRequest.class, ListEnhancedConnectionsResponse.class)
            .withName("ListEnhancedConnections")
            .withUri("/v2.0/{project_id}/datasource/enhanced-connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobs =
        genForlistFlinkJobs();

    private static HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> genForlistFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobsRequest, ListFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobsRequest.class, ListFlinkJobsResponse.class)
                .withName("ListFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("sys_enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getSysEnterpriseProjectName, (req, v) -> {
                req.setSysEnterpriseProjectName(v);
            }));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getShowDetail, (req, v) -> {
                req.setShowDetail(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("root_job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getRootJobId, (req, v) -> {
                req.setRootJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> registerBucket =
        genForregisterBucket();

    private static HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> genForregisterBucket() {
        // basic
        HttpRequestDef.Builder<RegisterBucketRequest, RegisterBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterBucketRequest.class, RegisterBucketResponse.class)
                .withName("RegisterBucket")
                .withUri("/v1.0/{project_id}/dli/obs-authorize")
                .withContentType("application/json");

        // requests
        builder.<ObsBuckets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObsBuckets.class),
            f -> f.withMarshaller(RegisterBucketRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJob = genForrunFlinkJob();

    private static HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> genForrunFlinkJob() {
        // basic
        HttpRequestDef.Builder<RunFlinkJobRequest, RunFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFlinkJobRequest.class, RunFlinkJobResponse.class)
                .withName("RunFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/run")
                .withContentType("application/json");

        // requests
        builder.<RunJobInBatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunJobInBatch.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CommonResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(RunFlinkJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CommonResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBack =
        genForrunIefJobActionCallBack();

    private static HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> genForrunIefJobActionCallBack() {
        // basic
        HttpRequestDef.Builder<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunIefJobActionCallBackRequest.class, RunIefJobActionCallBackResponse.class)
            .withName("RunIefJobActionCallBack")
            .withUri("/v1/{project_id}/edgesrv/messages")
            .withContentType("application/json");

        // requests
        builder.<IefFlinkJobMessagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefFlinkJobMessagesReq.class),
            f -> f.withMarshaller(RunIefJobActionCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnection =
        genForshowDatasourceConnection();

    private static HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> genForshowDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDatasourceConnectionRequest.class, ShowDatasourceConnectionResponse.class)
                .withName("ShowDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasourceConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> showEnhancedConnection =
        genForshowEnhancedConnection();

    private static HttpRequestDef<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> genForshowEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnhancedConnectionRequest.class, ShowEnhancedConnectionResponse.class)
            .withName("ShowEnhancedConnection")
            .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse> showEnhancedPrivilege =
        genForshowEnhancedPrivilege();

    private static HttpRequestDef<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse> genForshowEnhancedPrivilege() {
        // basic
        HttpRequestDef.Builder<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnhancedPrivilegeRequest.class, ShowEnhancedPrivilegeResponse.class)
            .withName("ShowEnhancedPrivilege")
            .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/privileges")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnhancedPrivilegeRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse> showFlinkExecuteGraph =
        genForshowFlinkExecuteGraph();

    private static HttpRequestDef<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse> genForshowFlinkExecuteGraph() {
        // basic
        HttpRequestDef.Builder<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFlinkExecuteGraphRequest.class, ShowFlinkExecuteGraphResponse.class)
            .withName("ShowFlinkExecuteGraph")
            .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}/execute-graph")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFlinkExecuteGraphRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJob = genForshowFlinkJob();

    private static HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> genForshowFlinkJob() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobRequest, ShowFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobRequest.class, ShowFlinkJobResponse.class)
                .withName("ShowFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetric =
        genForshowFlinkMetric();

    private static HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> genForshowFlinkMetric() {
        // basic
        HttpRequestDef.Builder<ShowFlinkMetricRequest, ShowFlinkMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFlinkMetricRequest.class, ShowFlinkMetricResponse.class)
                .withName("ShowFlinkMetric")
                .withUri("/v1.0/{project_id}/streaming/jobs/metrics")
                .withContentType("application/json");

        // requests
        builder.<ShowJobMonitorInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowJobMonitorInfoReq.class),
            f -> f.withMarshaller(ShowFlinkMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopFlinkJobRequest, StopFlinkJobResponse> stopFlinkJob = genForstopFlinkJob();

    private static HttpRequestDef<StopFlinkJobRequest, StopFlinkJobResponse> genForstopFlinkJob() {
        // basic
        HttpRequestDef.Builder<StopFlinkJobRequest, StopFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopFlinkJobRequest.class, StopFlinkJobResponse.class)
                .withName("StopFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/stop")
                .withContentType("application/json");

        // requests
        builder.<StopFlinkJobInBatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopFlinkJobInBatch.class),
            f -> f.withMarshaller(StopFlinkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CommonResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(StopFlinkJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CommonResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> updateElasticResourcePool =
        genForupdateElasticResourcePool();

    private static HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> genForupdateElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateElasticResourcePoolRequest.class,
                    UpdateElasticResourcePoolResponse.class)
                .withName("UpdateElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<UpdateElasticResourcePoolInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolInfo.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse> updateElasticResourcePoolQueueInfo =
        genForupdateElasticResourcePoolQueueInfo();

    private static HttpRequestDef<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse> genForupdateElasticResourcePoolQueueInfo() {
        // basic
        HttpRequestDef.Builder<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateElasticResourcePoolQueueInfoRequest.class,
                    UpdateElasticResourcePoolQueueInfoResponse.class)
                .withName("UpdateElasticResourcePoolQueueInfo")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueInfoRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueInfoRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<UpdateElasticResourcePoolQueueScalingPolicyInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolQueueScalingPolicyInfo.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJarRequest, UpdateFlinkJarResponse> updateFlinkJar =
        genForupdateFlinkJar();

    private static HttpRequestDef<UpdateFlinkJarRequest, UpdateFlinkJarResponse> genForupdateFlinkJar() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkJarRequest, UpdateFlinkJarResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlinkJarRequest.class, UpdateFlinkJarResponse.class)
                .withName("UpdateFlinkJar")
                .withUri("/v1.0/{project_id}/streaming/flink-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkJarRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateFlinkdefinedJobsResp>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkdefinedJobsResp.class),
            f -> f.withMarshaller(UpdateFlinkJarRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse> updateFlinkSql =
        genForupdateFlinkSql();

    private static HttpRequestDef<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse> genForupdateFlinkSql() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlinkSqlRequest.class, UpdateFlinkSqlResponse.class)
                .withName("UpdateFlinkSql")
                .withUri("/v1.0/{project_id}/streaming/sql-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkSqlRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateSQLJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSQLJobReq.class),
            f -> f.withMarshaller(UpdateFlinkSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostMassageRequest, UpdateHostMassageResponse> updateHostMassage =
        genForupdateHostMassage();

    private static HttpRequestDef<UpdateHostMassageRequest, UpdateHostMassageResponse> genForupdateHostMassage() {
        // basic
        HttpRequestDef.Builder<UpdateHostMassageRequest, UpdateHostMassageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostMassageRequest.class, UpdateHostMassageResponse.class)
                .withName("UpdateHostMassage")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostMassageRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<UpdateHostMassageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHostMassageReq.class),
            f -> f.withMarshaller(UpdateHostMassageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgency =
        genForcreateDliAgency();

    private static HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> genForcreateDliAgency() {
        // basic
        HttpRequestDef.Builder<CreateDliAgencyRequest, CreateDliAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDliAgencyRequest.class, CreateDliAgencyResponse.class)
                .withName("CreateDliAgency")
                .withUri("/v2/{project_id}/agency")
                .withContentType("application/json");

        // requests
        builder.<CreateAgencyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAgencyRequest.class),
            f -> f.withMarshaller(CreateDliAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgency =
        genForshowDliAgency();

    private static HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> genForshowDliAgency() {
        // basic
        HttpRequestDef.Builder<ShowDliAgencyRequest, ShowDliAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDliAgencyRequest.class, ShowDliAgencyResponse.class)
                .withName("ShowDliAgency")
                .withUri("/v2/{project_id}/agency")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelBatchJobRequest, CancelBatchJobResponse> cancelBatchJob =
        genForcancelBatchJob();

    private static HttpRequestDef<CancelBatchJobRequest, CancelBatchJobResponse> genForcancelBatchJob() {
        // basic
        HttpRequestDef.Builder<CancelBatchJobRequest, CancelBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelBatchJobRequest.class, CancelBatchJobResponse.class)
                .withName("CancelBatchJob")
                .withUri("/v2.0/{project_id}/batches/{batch_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelBatchJobRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJob =
        genForcreateBatchJob();

    private static HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> genForcreateBatchJob() {
        // basic
        HttpRequestDef.Builder<CreateBatchJobRequest, CreateBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchJobRequest.class, CreateBatchJobResponse.class)
                .withName("CreateBatchJob")
                .withUri("/v2.0/{project_id}/batches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER_ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<CreateBatchJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchJobReq.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchesRequest, ListBatchesResponse> listBatches = genForlistBatches();

    private static HttpRequestDef<ListBatchesRequest, ListBatchesResponse> genForlistBatches() {
        // basic
        HttpRequestDef.Builder<ListBatchesRequest, ListBatchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchesRequest.class, ListBatchesResponse.class)
                .withName("ListBatches")
                .withUri("/v2.0/{project_id}/batches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchesRequest::getClusterName, (req, v) -> {
                req.setClusterName(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchesRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("job-id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchesRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchesRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchesRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchesRequest::getState, (req, v) -> {
                req.setState(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForlistResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForlistResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchInfoRequest, ShowBatchInfoResponse> showBatchInfo =
        genForshowBatchInfo();

    private static HttpRequestDef<ShowBatchInfoRequest, ShowBatchInfoResponse> genForshowBatchInfo() {
        // basic
        HttpRequestDef.Builder<ShowBatchInfoRequest, ShowBatchInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchInfoRequest.class, ShowBatchInfoResponse.class)
                .withName("ShowBatchInfo")
                .withUri("/v2.0/{project_id}/batches/{batch_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchInfoRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchLogRequest, ShowBatchLogResponse> showBatchLog = genForshowBatchLog();

    private static HttpRequestDef<ShowBatchLogRequest, ShowBatchLogResponse> genForshowBatchLog() {
        // basic
        HttpRequestDef.Builder<ShowBatchLogRequest, ShowBatchLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchLogRequest.class, ShowBatchLogResponse.class)
                .withName("ShowBatchLog")
                .withUri("/v2.0/{project_id}/batches/{batch_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getIndex, (req, v) -> {
                req.setIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchStateRequest, ShowBatchStateResponse> showBatchState =
        genForshowBatchState();

    private static HttpRequestDef<ShowBatchStateRequest, ShowBatchStateResponse> genForshowBatchState() {
        // basic
        HttpRequestDef.Builder<ShowBatchStateRequest, ShowBatchStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchStateRequest.class, ShowBatchStateResponse.class)
                .withName("ShowBatchState")
                .withUri("/v2.0/{project_id}/batches/{batch_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchStateRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfo =
        genForshowResourceInfo();

    private static HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> genForshowResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowResourceInfoRequest, ShowResourceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceInfoRequest.class, ShowResourceInfoResponse.class)
                .withName("ShowResourceInfo")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceInfoRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceInfoRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwner =
        genForupdateGroupOrResourceOwner();

    private static HttpRequestDef<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> genForupdateGroupOrResourceOwner() {
        // basic
        HttpRequestDef.Builder<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGroupOrResourceOwnerRequest.class,
                    UpdateGroupOrResourceOwnerResponse.class)
                .withName("UpdateGroupOrResourceOwner")
                .withUri("/v2.0/{project_id}/resources/owner")
                .withContentType("application/json");

        // requests
        builder.<UpdateResourceOwner>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceOwner.class),
            f -> f.withMarshaller(UpdateGroupOrResourceOwnerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFilesRequest, UploadFilesResponse> uploadFiles = genForuploadFiles();

    private static HttpRequestDef<UploadFilesRequest, UploadFilesResponse> genForuploadFiles() {
        // basic
        HttpRequestDef.Builder<UploadFilesRequest, UploadFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFilesRequest.class, UploadFilesResponse.class)
                .withName("UploadFiles")
                .withUri("/v2.0/{project_id}/resources/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER_ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFilesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadFilesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJarsRequest, UploadJarsResponse> uploadJars = genForuploadJars();

    private static HttpRequestDef<UploadJarsRequest, UploadJarsResponse> genForuploadJars() {
        // basic
        HttpRequestDef.Builder<UploadJarsRequest, UploadJarsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadJarsRequest.class, UploadJarsResponse.class)
                .withName("UploadJars")
                .withUri("/v2.0/{project_id}/resources/jars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER_ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJarsRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadJarsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadPythonFilesRequest, UploadPythonFilesResponse> uploadPythonFiles =
        genForuploadPythonFiles();

    private static HttpRequestDef<UploadPythonFilesRequest, UploadPythonFilesResponse> genForuploadPythonFiles() {
        // basic
        HttpRequestDef.Builder<UploadPythonFilesRequest, UploadPythonFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadPythonFilesRequest.class, UploadPythonFilesResponse.class)
                .withName("UploadPythonFiles")
                .withUri("/v2.0/{project_id}/resources/pyfiles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER_ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPythonFilesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadPythonFilesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadResourcesRequest, UploadResourcesResponse> uploadResources =
        genForuploadResources();

    private static HttpRequestDef<UploadResourcesRequest, UploadResourcesResponse> genForuploadResources() {
        // basic
        HttpRequestDef.Builder<UploadResourcesRequest, UploadResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadResourcesRequest.class, UploadResourcesResponse.class)
                .withName("UploadResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER_ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadResourcesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadPackageGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadPackageGroupReq.class),
            f -> f.withMarshaller(UploadResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlans =
        genForbatchDeleteQueuePlans();

    private static HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> genForbatchDeleteQueuePlans() {
        // basic
        HttpRequestDef.Builder<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteQueuePlansRequest.class, BatchDeleteQueuePlansResponse.class)
            .withName("BatchDeleteQueuePlans")
            .withUri("/v1/{project_id}/queues/{queue_name}/plans/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<PlanIdslReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PlanIdslReq.class),
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelJobRequest, CancelJobResponse> cancelJob = genForcancelJob();

    private static HttpRequestDef<CancelJobRequest, CancelJobResponse> genForcancelJob() {
        // basic
        HttpRequestDef.Builder<CancelJobRequest, CancelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelJobRequest.class, CancelJobResponse.class)
                .withName("CancelJob")
                .withUri("/v1.0/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAuthorizationRequest, ChangeAuthorizationResponse> changeAuthorization =
        genForchangeAuthorization();

    private static HttpRequestDef<ChangeAuthorizationRequest, ChangeAuthorizationResponse> genForchangeAuthorization() {
        // basic
        HttpRequestDef.Builder<ChangeAuthorizationRequest, ChangeAuthorizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeAuthorizationRequest.class, ChangeAuthorizationResponse.class)
                .withName("ChangeAuthorization")
                .withUri("/v1.0/{project_id}/user-authorization")
                .withContentType("application/json");

        // requests
        builder.<GrantDataPermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantDataPermissionReq.class),
            f -> f.withMarshaller(ChangeAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeQueuePlanRequest, ChangeQueuePlanResponse> changeQueuePlan =
        genForchangeQueuePlan();

    private static HttpRequestDef<ChangeQueuePlanRequest, ChangeQueuePlanResponse> genForchangeQueuePlan() {
        // basic
        HttpRequestDef.Builder<ChangeQueuePlanRequest, ChangeQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeQueuePlanRequest.class, ChangeQueuePlanResponse.class)
                .withName("ChangeQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<SetQueuePlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQueuePlanReq.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckConnectionRequest, CheckConnectionResponse> checkConnection =
        genForcheckConnection();

    private static HttpRequestDef<CheckConnectionRequest, CheckConnectionResponse> genForcheckConnection() {
        // basic
        HttpRequestDef.Builder<CheckConnectionRequest, CheckConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckConnectionRequest.class, CheckConnectionResponse.class)
                .withName("CheckConnection")
                .withUri("/v1.0/{project_id}/queues/{queue_name}/connection-test")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckConnectionRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<VerityConnectivityReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerityConnectivityReq.class),
            f -> f.withMarshaller(CheckConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSqlRequest, CheckSqlResponse> checkSql = genForcheckSql();

    private static HttpRequestDef<CheckSqlRequest, CheckSqlResponse> genForcheckSql() {
        // basic
        HttpRequestDef.Builder<CheckSqlRequest, CheckSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckSqlRequest.class, CheckSqlResponse.class)
                .withName("CheckSql")
                .withUri("/v1.0/{project_id}/jobs/check-sql")
                .withContentType("application/json");

        // requests
        builder.<CheckSQLGramarReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckSQLGramarReq.class),
            f -> f.withMarshaller(CheckSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForcreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForcreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v1.0/{project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<CreateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobResultRequest, CreateJobResultResponse> createJobResult =
        genForcreateJobResult();

    private static HttpRequestDef<CreateJobResultRequest, CreateJobResultResponse> genForcreateJobResult() {
        // basic
        HttpRequestDef.Builder<CreateJobResultRequest, CreateJobResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobResultRequest.class, CreateJobResultResponse.class)
                .withName("CreateJobResult")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/export-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateJobResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ExportResultReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportResultReq.class),
            f -> f.withMarshaller(CreateJobResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForcreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForcreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.<CreateQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQueueReq.class),
            f -> f.withMarshaller(CreateQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlan =
        genForcreateQueuePlan();

    private static HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> genForcreateQueuePlan() {
        // basic
        HttpRequestDef.Builder<CreateQueuePlanRequest, CreateQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueuePlanRequest.class, CreateQueuePlanResponse.class)
                .withName("CreateQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<SetQueuePlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQueuePlanReq.class),
            f -> f.withMarshaller(CreateQueuePlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForcreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForcreateTable() {
        // basic
        HttpRequestDef.Builder<CreateTableRequest, CreateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableRequest.class, CreateTableResponse.class)
                .withName("CreateTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<CreateTableReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTableReq.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genFordeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genFordeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v1.0/{project_id}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCascade, (req, v) -> {
                req.setCascade(v);
            }));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getAsync, (req, v) -> {
                req.setAsync(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlan =
        genFordeleteQueuePlan();

    private static HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> genFordeleteQueuePlan() {
        // basic
        HttpRequestDef.Builder<DeleteQueuePlanRequest, DeleteQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueuePlanRequest.class, DeleteQueuePlanResponse.class)
                .withName("DeleteQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<Long>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteQueuePlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genFordeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genFordeleteTable() {
        // basic
        HttpRequestDef.Builder<DeleteTableRequest, DeleteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTableRequest.class, DeleteTableResponse.class)
                .withName("DeleteTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteTableRequest::getAsync, (req, v) -> {
                req.setAsync(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDataRequest, ExportDataResponse> exportData = genForexportData();

    private static HttpRequestDef<ExportDataRequest, ExportDataResponse> genForexportData() {
        // basic
        HttpRequestDef.Builder<ExportDataRequest, ExportDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportDataRequest.class, ExportDataResponse.class)
                .withName("ExportData")
                .withUri("/v1.0/{project_id}/jobs/export-table")
                .withContentType("application/json");

        // requests
        builder.<ExportTableReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportTableReq.class),
            f -> f.withMarshaller(ExportDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForimportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForimportData() {
        // basic
        HttpRequestDef.Builder<ImportDataRequest, ImportDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDataRequest.class, ImportDataResponse.class)
                .withName("ImportData")
                .withUri("/v1.0/{project_id}/jobs/import-table")
                .withContentType("application/json");

        // requests
        builder.<ImportTableReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTableReq.class),
            f -> f.withMarshaller(ImportDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForlistDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForlistDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v1.0/{project_id}/databases/{database_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForlistDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForlistDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v1.0/{project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDatabasesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1.0/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<Long>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobsRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<ListJobsRequest.JobTypeEnum>withRequestField("job-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<String>withRequestField("job-status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getJobStatus, (req, v) -> {
                req.setJobStatus(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("sql_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSqlPattern, (req, v) -> {
                req.setSqlPattern(v);
            }));
        builder.<ListJobsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("engine-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEngineType, (req, v) -> {
                req.setEngineType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlans =
        genForlistQueuePlans();

    private static HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> genForlistQueuePlans() {
        // basic
        HttpRequestDef.Builder<ListQueuePlansRequest, ListQueuePlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuePlansRequest.class, ListQueuePlansResponse.class)
                .withName("ListQueuePlans")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuePlansRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsers =
        genForlistQueueUsers();

    private static HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> genForlistQueueUsers() {
        // basic
        HttpRequestDef.Builder<ListQueueUsersRequest, ListQueueUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueueUsersRequest.class, ListQueueUsersResponse.class)
                .withName("ListQueueUsers")
                .withUri("/v1.0/{project_id}/queues/{queue_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueueUsersRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForlistQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForlistQueues() {
        // basic
        HttpRequestDef.Builder<ListQueuesRequest, ListQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuesRequest.class, ListQueuesResponse.class)
                .withName("ListQueues")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            }));
        builder.<Boolean>withRequestField("with-charge-info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithChargeInfo, (req, v) -> {
                req.setWithChargeInfo(v);
            }));
        builder.<String>withRequestField("queue_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getQueueType, (req, v) -> {
                req.setQueueType(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuesRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivileges =
        genForlistTablePrivileges();

    private static HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> genForlistTablePrivileges() {
        // basic
        HttpRequestDef.Builder<ListTablePrivilegesRequest, ListTablePrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablePrivilegesRequest.class, ListTablePrivilegesResponse.class)
                .withName("ListTablePrivileges")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> listTableUsers =
        genForlistTableUsers();

    private static HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> genForlistTableUsers() {
        // basic
        HttpRequestDef.Builder<ListTableUsersRequest, ListTableUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTableUsersRequest.class, ListTableUsersResponse.class)
                .withName("ListTableUsers")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableUsersRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableUsersRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForlistTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForlistTables() {
        // basic
        HttpRequestDef.Builder<ListTablesRequest, ListTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesRequest.class, ListTablesResponse.class)
                .withName("ListTables")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Boolean>withRequestField("with-detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getWithDetail, (req, v) -> {
                req.setWithDetail(v);
            }));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            }));
        builder.<String>withRequestField("table-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableType, (req, v) -> {
                req.setTableType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueue =
        genForregisterAuthorizedQueue();

    private static HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> genForregisterAuthorizedQueue() {
        // basic
        HttpRequestDef.Builder<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RegisterAuthorizedQueueRequest.class, RegisterAuthorizedQueueResponse.class)
            .withName("RegisterAuthorizedQueue")
            .withUri("/v1.0/{project_id}/queues/user-authorization")
            .withContentType("application/json");

        // requests
        builder.<GrantQueuePermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantQueuePermissionReq.class),
            f -> f.withMarshaller(RegisterAuthorizedQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForrunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForrunJob() {
        // basic
        HttpRequestDef.Builder<RunJobRequest, RunJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobRequest.class, RunJobResponse.class)
                .withName("RunJob")
                .withUri("/v1.0/{project_id}/jobs/submit-job")
                .withContentType("application/json");

        // requests
        builder.<CommitJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitJobReq.class),
            f -> f.withMarshaller(RunJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> runQueueAction =
        genForrunQueueAction();

    private static HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> genForrunQueueAction() {
        // basic
        HttpRequestDef.Builder<RunQueueActionRequest, RunQueueActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RunQueueActionRequest.class, RunQueueActionResponse.class)
                .withName("RunQueueAction")
                .withUri("/v1.0/{project_id}/queues/{queue_name}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueueActionRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<RunQueueActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunQueueActionReq.class),
            f -> f.withMarshaller(RunQueueActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDescribeTableRequest, ShowDescribeTableResponse> showDescribeTable =
        genForshowDescribeTable();

    private static HttpRequestDef<ShowDescribeTableRequest, ShowDescribeTableResponse> genForshowDescribeTable() {
        // basic
        HttpRequestDef.Builder<ShowDescribeTableRequest, ShowDescribeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDescribeTableRequest.class, ShowDescribeTableResponse.class)
                .withName("ShowDescribeTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDescribeTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDescribeTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailInfoRequest, ShowDetailInfoResponse> showDetailInfo =
        genForshowDetailInfo();

    private static HttpRequestDef<ShowDetailInfoRequest, ShowDetailInfoResponse> genForshowDetailInfo() {
        // basic
        HttpRequestDef.Builder<ShowDetailInfoRequest, ShowDetailInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailInfoRequest.class, ShowDetailInfoResponse.class)
                .withName("ShowDetailInfo")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgress =
        genForshowJobProgress();

    private static HttpRequestDef<ShowJobProgressRequest, ShowJobProgressResponse> genForshowJobProgress() {
        // basic
        HttpRequestDef.Builder<ShowJobProgressRequest, ShowJobProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobProgressRequest.class, ShowJobProgressResponse.class)
                .withName("ShowJobProgress")
                .withUri("/v1/{project_id}/jobs/{job_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobProgressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobResultRequest, ShowJobResultResponse> showJobResult =
        genForshowJobResult();

    private static HttpRequestDef<ShowJobResultRequest, ShowJobResultResponse> genForshowJobResult() {
        // basic
        HttpRequestDef.Builder<ShowJobResultRequest, ShowJobResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobResultRequest.class, ShowJobResultResponse.class)
                .withName("ShowJobResult")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("queue-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobResultRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse> showNodeConnectivity =
        genForshowNodeConnectivity();

    private static HttpRequestDef<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse> genForshowNodeConnectivity() {
        // basic
        HttpRequestDef.Builder<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNodeConnectivityRequest.class, ShowNodeConnectivityResponse.class)
            .withName("ShowNodeConnectivity")
            .withUri("/v1.0/{project_id}/queues/{queue_name}/connection-test/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeConnectivityRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeConnectivityRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowObjectUserRequest, ShowObjectUserResponse> showObjectUser =
        genForshowObjectUser();

    private static HttpRequestDef<ShowObjectUserRequest, ShowObjectUserResponse> genForshowObjectUser() {
        // basic
        HttpRequestDef.Builder<ShowObjectUserRequest, ShowObjectUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowObjectUserRequest.class, ShowObjectUserResponse.class)
                .withName("ShowObjectUser")
                .withUri("/v1.0/{project_id}/authorization/privileges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectUserRequest::getObject, (req, v) -> {
                req.setObject(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowObjectUserRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowObjectUserRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionsRequest, ShowPartitionsResponse> showPartitions =
        genForshowPartitions();

    private static HttpRequestDef<ShowPartitionsRequest, ShowPartitionsResponse> genForshowPartitions() {
        // basic
        HttpRequestDef.Builder<ShowPartitionsRequest, ShowPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionsRequest.class, ShowPartitionsResponse.class)
                .withName("ShowPartitions")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueDetailRequest, ShowQueueDetailResponse> showQueueDetail =
        genForshowQueueDetail();

    private static HttpRequestDef<ShowQueueDetailRequest, ShowQueueDetailResponse> genForshowQueueDetail() {
        // basic
        HttpRequestDef.Builder<ShowQueueDetailRequest, ShowQueueDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueDetailRequest.class, ShowQueueDetailResponse.class)
                .withName("ShowQueueDetail")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueDetailRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("queue_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueDetailRequest::getQueueType, (req, v) -> {
                req.setQueueType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableContentRequest, ShowTableContentResponse> showTableContent =
        genForshowTableContent();

    private static HttpRequestDef<ShowTableContentRequest, ShowTableContentResponse> genForshowTableContent() {
        // basic
        HttpRequestDef.Builder<ShowTableContentRequest, ShowTableContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableContentRequest.class, ShowTableContentResponse.class)
                .withName("ShowTableContent")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwner =
        genForupdateDatabaseOwner();

    private static HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> genForupdateDatabaseOwner() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabaseOwnerRequest.class, UpdateDatabaseOwnerResponse.class)
                .withName("UpdateDatabaseOwner")
                .withUri("/v1.0/{project_id}/databases/{database_name}/owner")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<UpdateDatabaseOwnerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseOwnerReq.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidr =
        genForupdateQueueCidr();

    private static HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> genForupdateQueueCidr() {
        // basic
        HttpRequestDef.Builder<UpdateQueueCidrRequest, UpdateQueueCidrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateQueueCidrRequest.class, UpdateQueueCidrResponse.class)
                .withName("UpdateQueueCidr")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueueCidrRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<UpdateQueueCidrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateQueueCidrReq.class),
            f -> f.withMarshaller(UpdateQueueCidrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
