/**
 * This class is generated by jOOQ
 */
package com.study.jooq.common.generated.tables;


import com.study.jooq.common.generated.Keys;
import com.study.jooq.common.generated.Study;
import com.study.jooq.common.generated.tables.records.OrderRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Order extends TableImpl<OrderRecord> {

	private static final long serialVersionUID = 620248172;

	/**
	 * The reference instance of <code>study.order</code>
	 */
	public static final Order ORDER = new Order();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<OrderRecord> getRecordType() {
		return OrderRecord.class;
	}

	/**
	 * The column <code>study.order.order_id</code>. 订单编号
	 */
	public final TableField<OrderRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单编号");

	/**
	 * The column <code>study.order.uid</code>. 用户Id
	 */
	public final TableField<OrderRecord, Integer> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGER, this, "用户Id");

	/**
	 * The column <code>study.order.amout</code>. 订单金额(单位为分)
	 */
	public final TableField<OrderRecord, String> AMOUT = createField("amout", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "订单金额(单位为分)");

	/**
	 * The column <code>study.order.status</code>. 订单状态
	 */
	public final TableField<OrderRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT, this, "订单状态");

	/**
	 * The column <code>study.order.order_time</code>. 订单时间
	 */
	public final TableField<OrderRecord, Timestamp> ORDER_TIME = createField("order_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "订单时间");

	/**
	 * Create a <code>study.order</code> table reference
	 */
	public Order() {
		this("order", null);
	}

	/**
	 * Create an aliased <code>study.order</code> table reference
	 */
	public Order(String alias) {
		this(alias, ORDER);
	}

	private Order(String alias, Table<OrderRecord> aliased) {
		this(alias, aliased, null);
	}

	private Order(String alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
		super(alias, Study.STUDY, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<OrderRecord> getPrimaryKey() {
		return Keys.KEY_ORDER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<OrderRecord>> getKeys() {
		return Arrays.<UniqueKey<OrderRecord>>asList(Keys.KEY_ORDER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Order as(String alias) {
		return new Order(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Order rename(String name) {
		return new Order(name, null);
	}
}