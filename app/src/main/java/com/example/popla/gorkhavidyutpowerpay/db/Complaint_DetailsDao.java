package com.example.popla.gorkhavidyutpowerpay.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COMPLAINT__DETAILS".
*/
public class Complaint_DetailsDao extends AbstractDao<Complaint_Details, Long> {

    public static final String TABLENAME = "COMPLAINT__DETAILS";

    /**
     * Properties of entity Complaint_Details.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Complaint_Id = new Property(0, Long.class, "Complaint_Id", true, "COMPLAINT__ID");
        public final static Property K_No = new Property(1, String.class, "K_No", false, "K__NO");
        public final static Property Login_by = new Property(2, String.class, "Login_by", false, "LOGIN_BY");
        public final static Property Submit_Date = new Property(3, String.class, "Submit_Date", false, "SUBMIT__DATE");
        public final static Property Comp_Msg = new Property(4, String.class, "comp_Msg", false, "COMP__MSG");
        public final static Property Status = new Property(5, String.class, "Status", false, "STATUS");
    }


    public Complaint_DetailsDao(DaoConfig config) {
        super(config);
    }
    
    public Complaint_DetailsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COMPLAINT__DETAILS\" (" + //
                "\"COMPLAINT__ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: Complaint_Id
                "\"K__NO\" TEXT," + // 1: K_No
                "\"LOGIN_BY\" TEXT," + // 2: Login_by
                "\"SUBMIT__DATE\" TEXT," + // 3: Submit_Date
                "\"COMP__MSG\" TEXT," + // 4: comp_Msg
                "\"STATUS\" TEXT);"); // 5: Status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COMPLAINT__DETAILS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Complaint_Details entity) {
        stmt.clearBindings();
 
        Long Complaint_Id = entity.getComplaint_Id();
        if (Complaint_Id != null) {
            stmt.bindLong(1, Complaint_Id);
        }
 
        String K_No = entity.getK_No();
        if (K_No != null) {
            stmt.bindString(2, K_No);
        }
 
        String Login_by = entity.getLogin_by();
        if (Login_by != null) {
            stmt.bindString(3, Login_by);
        }
 
        String Submit_Date = entity.getSubmit_Date();
        if (Submit_Date != null) {
            stmt.bindString(4, Submit_Date);
        }
 
        String comp_Msg = entity.getComp_Msg();
        if (comp_Msg != null) {
            stmt.bindString(5, comp_Msg);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(6, Status);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Complaint_Details entity) {
        stmt.clearBindings();
 
        Long Complaint_Id = entity.getComplaint_Id();
        if (Complaint_Id != null) {
            stmt.bindLong(1, Complaint_Id);
        }
 
        String K_No = entity.getK_No();
        if (K_No != null) {
            stmt.bindString(2, K_No);
        }
 
        String Login_by = entity.getLogin_by();
        if (Login_by != null) {
            stmt.bindString(3, Login_by);
        }
 
        String Submit_Date = entity.getSubmit_Date();
        if (Submit_Date != null) {
            stmt.bindString(4, Submit_Date);
        }
 
        String comp_Msg = entity.getComp_Msg();
        if (comp_Msg != null) {
            stmt.bindString(5, comp_Msg);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(6, Status);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Complaint_Details readEntity(Cursor cursor, int offset) {
        Complaint_Details entity = new Complaint_Details( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // Complaint_Id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // K_No
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Login_by
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Submit_Date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // comp_Msg
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // Status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Complaint_Details entity, int offset) {
        entity.setComplaint_Id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setK_No(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLogin_by(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSubmit_Date(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setComp_Msg(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStatus(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Complaint_Details entity, long rowId) {
        entity.setComplaint_Id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Complaint_Details entity) {
        if(entity != null) {
            return entity.getComplaint_Id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Complaint_Details entity) {
        return entity.getComplaint_Id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}