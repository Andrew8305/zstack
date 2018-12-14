package org.zstack.header.storage.primary

import org.zstack.header.errorcode.ErrorCode

doc {

	title "清理主存储上的回收数据结果"

	ref {
		name "error"
		path "org.zstack.header.storage.primary.APICleanUpTrashOnPrimaryStorageEvent.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "3.2.0"
		clz ErrorCode.class
	}
}