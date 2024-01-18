package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.GetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.GetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.PutKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.PutKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.RenameKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.RenameKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.TransactWriteSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.TransactWriteSkeyKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvResponse;

@SuppressWarnings("unchecked")
public class KvsMeta {

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForCreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForCreateTable() {
        // basic
        HttpRequestDef.Builder<CreateTableRequest, CreateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableRequest.class, CreateTableResponse.class)
                .withName("CreateTable")
                .withUri("/v1/create-table")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getStoreName, CreateTableRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeTableRequest, DescribeTableResponse> describeTable =
        genForDescribeTable();

    private static HttpRequestDef<DescribeTableRequest, DescribeTableResponse> genForDescribeTable() {
        // basic
        HttpRequestDef.Builder<DescribeTableRequest, DescribeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeTableRequest.class, DescribeTableResponse.class)
                .withName("DescribeTable")
                .withUri("/v1/describe-table")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeTableRequest::getStoreName, DescribeTableRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoreRequest, ListStoreResponse> listStore = genForListStore();

    private static HttpRequestDef<ListStoreRequest, ListStoreResponse> genForListStore() {
        // basic
        HttpRequestDef.Builder<ListStoreRequest, ListStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListStoreRequest.class, ListStoreResponse.class)
                .withName("ListStore")
                .withUri("/v1/list-store")
                .withContentType("application/bson");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableRequest, ListTableResponse> listTable = genForListTable();

    private static HttpRequestDef<ListTableRequest, ListTableResponse> genForListTable() {
        // basic
        HttpRequestDef.Builder<ListTableRequest, ListTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTableRequest.class, ListTableResponse.class)
                .withName("ListTable")
                .withUri("/v1/list-table")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableRequest::getStoreName, ListTableRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchGetKvRequest, BatchGetKvResponse> batchGetKv = genForBatchGetKv();

    private static HttpRequestDef<BatchGetKvRequest, BatchGetKvResponse> genForBatchGetKv() {
        // basic
        HttpRequestDef.Builder<BatchGetKvRequest, BatchGetKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchGetKvRequest.class, BatchGetKvResponse.class)
                .withName("BatchGetKv")
                .withUri("/v1/batch-get-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchGetKvRequest::getStoreName, BatchGetKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKv = genForBatchWriteKv();

    private static HttpRequestDef<BatchWriteKvRequest, BatchWriteKvResponse> genForBatchWriteKv() {
        // basic
        HttpRequestDef.Builder<BatchWriteKvRequest, BatchWriteKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchWriteKvRequest.class, BatchWriteKvResponse.class)
                .withName("BatchWriteKv")
                .withUri("/v1/batch-write-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchWriteKvRequest::getStoreName, BatchWriteKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKvRequest, DeleteKvResponse> deleteKv = genForDeleteKv();

    private static HttpRequestDef<DeleteKvRequest, DeleteKvResponse> genForDeleteKv() {
        // basic
        HttpRequestDef.Builder<DeleteKvRequest, DeleteKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteKvRequest.class, DeleteKvResponse.class)
                .withName("DeleteKv")
                .withUri("/v1/delete-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKvRequest::getStoreName, DeleteKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetKvRequest, GetKvResponse> getKv = genForGetKv();

    private static HttpRequestDef<GetKvRequest, GetKvResponse> genForGetKv() {
        // basic
        HttpRequestDef.Builder<GetKvRequest, GetKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetKvRequest.class, GetKvResponse.class)
                .withName("GetKv")
                .withUri("/v1/get-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetKvRequest::getStoreName, GetKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutKvRequest, PutKvResponse> putKv = genForPutKv();

    private static HttpRequestDef<PutKvRequest, PutKvResponse> genForPutKv() {
        // basic
        HttpRequestDef.Builder<PutKvRequest, PutKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PutKvRequest.class, PutKvResponse.class)
                .withName("PutKv")
                .withUri("/v1/put-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutKvRequest::getStoreName, PutKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameKvRequest, RenameKvResponse> renameKv = genForRenameKv();

    private static HttpRequestDef<RenameKvRequest, RenameKvResponse> genForRenameKv() {
        // basic
        HttpRequestDef.Builder<RenameKvRequest, RenameKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RenameKvRequest.class, RenameKvResponse.class)
                .withName("RenameKv")
                .withUri("/v1/rename-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameKvRequest::getStoreName, RenameKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ScanKvRequest, ScanKvResponse> scanKv = genForScanKv();

    private static HttpRequestDef<ScanKvRequest, ScanKvResponse> genForScanKv() {
        // basic
        HttpRequestDef.Builder<ScanKvRequest, ScanKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ScanKvRequest.class, ScanKvResponse.class)
                .withName("ScanKv")
                .withUri("/v1/scan-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScanKvRequest::getStoreName, ScanKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKv = genForScanSkeyKv();

    private static HttpRequestDef<ScanSkeyKvRequest, ScanSkeyKvResponse> genForScanSkeyKv() {
        // basic
        HttpRequestDef.Builder<ScanSkeyKvRequest, ScanSkeyKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ScanSkeyKvRequest.class, ScanSkeyKvResponse.class)
                .withName("ScanSkeyKv")
                .withUri("/v1/scan-skey-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScanSkeyKvRequest::getStoreName, ScanSkeyKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransactWriteSkeyKvRequest, TransactWriteSkeyKvResponse> transactWriteSkeyKv =
        genForTransactWriteSkeyKv();

    private static HttpRequestDef<TransactWriteSkeyKvRequest, TransactWriteSkeyKvResponse> genForTransactWriteSkeyKv() {
        // basic
        HttpRequestDef.Builder<TransactWriteSkeyKvRequest, TransactWriteSkeyKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TransactWriteSkeyKvRequest.class, TransactWriteSkeyKvResponse.class)
                .withName("TransactWriteSkeyKv")
                .withUri("/v1/transact-write-skey-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TransactWriteSkeyKvRequest::getStoreName, TransactWriteSkeyKvRequest::setStoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKvRequest, UpdateKvResponse> updateKv = genForUpdateKv();

    private static HttpRequestDef<UpdateKvRequest, UpdateKvResponse> genForUpdateKv() {
        // basic
        HttpRequestDef.Builder<UpdateKvRequest, UpdateKvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKvRequest.class, UpdateKvResponse.class)
                .withName("UpdateKv")
                .withUri("/v1/update-kv")
                .withContentType("application/bson");

        // requests
        builder.<String>withRequestField("store_name",
            LocationType.Cname,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKvRequest::getStoreName, UpdateKvRequest::setStoreName));

        // response

        return builder.build();
    }

}
