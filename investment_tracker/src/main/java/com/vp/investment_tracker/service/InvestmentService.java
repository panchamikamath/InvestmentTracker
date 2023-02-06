package com.vp.investment_tracker.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.vp.investment_tracker.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class InvestmentService {
    public static final String COL_NAME="User";

    public long getTotalMutualFundsInvested(String documentID) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(documentID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        User user = null;

        if(document.exists()) {
            user = document.toObject(User.class);
            long totalMutualFundsInvestedValue=0;
            for(int i=0;i<user.getMutualFundList().size();i++){
                totalMutualFundsInvestedValue = totalMutualFundsInvestedValue + (user.getMutualFundList().get(i).getInvestedValue()*user.getMutualFundList().get(i).getUnits());
            }
            return totalMutualFundsInvestedValue;
        }
        return 0;
    }

    public long getTotalInvestedValue(String documentID) throws ExecutionException, InterruptedException {
        return getTotalMutualFundsInvested(documentID);
    }
}
