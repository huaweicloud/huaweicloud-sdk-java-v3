package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteByConditionVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveAllDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUniqueKeyDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestCountVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestSelectedVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestStaticsVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelSaveAsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;

@SuppressWarnings("unchecked")
public class IDMEClassicAPIMeta {

    public static final HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPost =
        genForBatchCreateUsingPost();

    private static HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> genForBatchCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateUsingPostRequest.class, BatchCreateUsingPostResponse.class)
            .withName("BatchCreateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getIdentifier,
                BatchCreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getModelName,
                BatchCreateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelCreateDTO.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getBody, BatchCreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPost =
        genForBatchDeleteLogicalUsingPost();

    private static HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> genForBatchDeleteLogicalUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLogicalUsingPostRequest.class,
                    BatchDeleteLogicalUsingPostResponse.class)
                .withName("BatchDeleteLogicalUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getIdentifier,
                BatchDeleteLogicalUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getModelName,
                BatchDeleteLogicalUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getBody,
                BatchDeleteLogicalUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPost =
        genForBatchDeleteUsingPost();

    private static HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> genForBatchDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUsingPostRequest.class, BatchDeleteUsingPostResponse.class)
            .withName("BatchDeleteUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDelete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getIdentifier,
                BatchDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getModelName,
                BatchDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getBody, BatchDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPost =
        genForBatchShowGetUsingPost();

    private static HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> genForBatchShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchShowGetUsingPostRequest.class, BatchShowGetUsingPostResponse.class)
            .withName("BatchShowGetUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchGet")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getIdentifier,
                BatchShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getModelName,
                BatchShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDecryptDTO.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getBody, BatchShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPost =
        genForBatchUpdateUsingPost();

    private static HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> genForBatchUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateUsingPostRequest.class, BatchUpdateUsingPostResponse.class)
            .withName("BatchUpdateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getIdentifier,
                BatchUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getModelName,
                BatchUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getBody, BatchUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> countUsingPost =
        genForCountUsingPost();

    private static HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> genForCountUsingPost() {
        // basic
        HttpRequestDef.Builder<CountUsingPostRequest, CountUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountUsingPostRequest.class, CountUsingPostResponse.class)
                .withName("CountUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getIdentifier, CountUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getModelName, CountUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestCountVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestCountVo.class),
            f -> f.withMarshaller(CountUsingPostRequest::getBody, CountUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPost =
        genForCreateUsingPost();

    private static HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> genForCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<CreateUsingPostRequest, CreateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUsingPostRequest.class, CreateUsingPostResponse.class)
                .withName("CreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getIdentifier, CreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getModelName, CreateUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelCreateDTO.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getBody, CreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPost =
        genForDeleteByConditionUsingPost();

    private static HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> genForDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteByConditionUsingPostRequest.class,
                    DeleteByConditionUsingPostResponse.class)
                .withName("DeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getIdentifier,
                DeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getModelName,
                DeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getBody,
                DeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPost =
        genForDeleteUsingPost();

    private static HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> genForDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteUsingPostRequest, DeleteUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteUsingPostRequest.class, DeleteUsingPostResponse.class)
                .withName("DeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getIdentifier, DeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getModelName, DeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getBody, DeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPost =
        genForListQueryUsingPost();

    private static HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> genForListQueryUsingPost() {
        // basic
        HttpRequestDef.Builder<ListQueryUsingPostRequest, ListQueryUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryUsingPostRequest.class, ListQueryUsingPostResponse.class)
                .withName("ListQueryUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/query/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getIdentifier, ListQueryUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getModelName, ListQueryUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSizePath,
                ListQueryUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPagePath,
                ListQueryUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPage, ListQueryUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getEndIndex, ListQueryUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getMaxPageSize,
                ListQueryUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSize, ListQueryUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getStartIndex, ListQueryUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalPages, ListQueryUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalRows, ListQueryUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getBody, ListQueryUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPost =
        genForListSelectUsingPost();

    private static HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> genForListSelectUsingPost() {
        // basic
        HttpRequestDef.Builder<ListSelectUsingPostRequest, ListSelectUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSelectUsingPostRequest.class, ListSelectUsingPostResponse.class)
                .withName("ListSelectUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/select/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getIdentifier,
                ListSelectUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getModelName, ListSelectUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSizePath,
                ListSelectUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPagePath,
                ListSelectUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPage, ListSelectUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getEndIndex, ListSelectUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getMaxPageSize,
                ListSelectUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSize, ListSelectUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getStartIndex,
                ListSelectUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalPages,
                ListSelectUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalRows, ListSelectUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestSelectedVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestSelectedVo.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getBody, ListSelectUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> listUsingPost =
        genForListUsingPost();

    private static HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> genForListUsingPost() {
        // basic
        HttpRequestDef.Builder<ListUsingPostRequest, ListUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsingPostRequest.class, ListUsingPostResponse.class)
                .withName("ListUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/list/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getIdentifier, ListUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getModelName, ListUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSizePath, ListUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPagePath, ListUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPage, ListUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getEndIndex, ListUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getMaxPageSize, ListUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSize, ListUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getStartIndex, ListUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalPages, ListUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalRows, ListUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListUsingPostRequest::getBody, ListUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPost =
        genForSaveAllUsingPost();

    private static HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> genForSaveAllUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAllUsingPostRequest, SaveAllUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAllUsingPostRequest.class, SaveAllUsingPostResponse.class)
                .withName("SaveAllUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getIdentifier, SaveAllUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getModelName, SaveAllUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveAllDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveAllDTO.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getBody, SaveAllUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPost =
        genForSaveAsUsingPost();

    private static HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> genForSaveAsUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAsUsingPostRequest, SaveAsUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAsUsingPostRequest.class, SaveAsUsingPostResponse.class)
                .withName("SaveAsUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getIdentifier, SaveAsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getModelName, SaveAsUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelSaveAsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelSaveAsDTO.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getBody, SaveAsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPost =
        genForSaveUsingPost();

    private static HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> genForSaveUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveUsingPostRequest, SaveUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveUsingPostRequest.class, SaveUsingPostResponse.class)
                .withName("SaveUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getIdentifier, SaveUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getModelName, SaveUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveDTO.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getBody, SaveUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPost =
        genForShowFindUsingPost();

    private static HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> genForShowFindUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowFindUsingPostRequest, ShowFindUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFindUsingPostRequest.class, ShowFindUsingPostResponse.class)
                .withName("ShowFindUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/find/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getIdentifier, ShowFindUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getModelName, ShowFindUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSizePath,
                ShowFindUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPagePath, ShowFindUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPage, ShowFindUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getEndIndex, ShowFindUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getMaxPageSize, ShowFindUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSize, ShowFindUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getStartIndex, ShowFindUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalPages, ShowFindUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalRows, ShowFindUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getBody, ShowFindUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKey =
        genForShowGetByUniqueKey();

    private static HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> genForShowGetByUniqueKey() {
        // basic
        HttpRequestDef.Builder<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetByUniqueKeyRequest.class, ShowGetByUniqueKeyResponse.class)
                .withName("ShowGetByUniqueKey")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/{getUniqueFieldMethod}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getIdentifier, ShowGetByUniqueKeyRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getModelName, ShowGetByUniqueKeyRequest::setModelName));
        builder.<String>withRequestField("getUniqueFieldMethod",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getGetUniqueFieldMethod,
                ShowGetByUniqueKeyRequest::setGetUniqueFieldMethod));
        builder.<RDMParamVOPersistableModelUniqueKeyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUniqueKeyDTO.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getBody, ShowGetByUniqueKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPost =
        genForShowGetUsingPost();

    private static HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> genForShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetUsingPostRequest, ShowGetUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetUsingPostRequest.class, ShowGetUsingPostResponse.class)
                .withName("ShowGetUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getIdentifier, ShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getModelName, ShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDecryptDTO.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getBody, ShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPost =
        genForShowLogicalDeleteByConditionUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> genForShowLogicalDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteByConditionUsingPostRequest.class,
                    ShowLogicalDeleteByConditionUsingPostResponse.class)
                .withName("ShowLogicalDeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getIdentifier,
                ShowLogicalDeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getModelName,
                ShowLogicalDeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getBody,
                ShowLogicalDeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPost =
        genForShowLogicalDeleteUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> genForShowLogicalDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteUsingPostRequest.class,
                    ShowLogicalDeleteUsingPostResponse.class)
                .withName("ShowLogicalDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getIdentifier,
                ShowLogicalDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getModelName,
                ShowLogicalDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getBody,
                ShowLogicalDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPost =
        genForShowStaticsUsingPost();

    private static HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> genForShowStaticsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowStaticsUsingPostRequest.class, ShowStaticsUsingPostResponse.class)
            .withName("ShowStaticsUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/statics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getIdentifier,
                ShowStaticsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getModelName,
                ShowStaticsUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestStaticsVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestStaticsVo.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getBody, ShowStaticsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPost =
        genForUpdateByConditionUsingPost();

    private static HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> genForUpdateByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateByConditionUsingPostRequest.class,
                    UpdateByConditionUsingPostResponse.class)
                .withName("UpdateByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getIdentifier,
                UpdateByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getModelName,
                UpdateByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getBody,
                UpdateByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPost =
        genForUpdateUsingPost();

    private static HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> genForUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateUsingPostRequest, UpdateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateUsingPostRequest.class, UpdateUsingPostResponse.class)
                .withName("UpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getIdentifier, UpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getModelName, UpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getBody, UpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

}
