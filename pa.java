<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#DFBF1F"
    tools:context=".ui.dashboard.DashboardFragment">

    <TextView
        android:id="@+id/FO"
        android:layout_width="420dp"
        android:layout_height="257dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:background="#F36C03"
        android:textAlignment="center"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />

    <Button
        android:id="@+id/su"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#D11A1A"
        android:text="+"
        app:iconTint="#981919"
        app:strokeColor="#DD1B1B"
        tools:layout_editor_absoluteX="158dp"
        tools:layout_editor_absoluteY="158dp" />

    <Button
        android:id="@+id/re"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#27CD4B"
        android:text="-"
        tools:layout_editor_absoluteX="158dp"
        tools:layout_editor_absoluteY="227dp" />

    <Button
        android:id="@+id/mu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#1D47C5"
        android:text="*"
        tools:layout_editor_absoluteX="158dp"
        tools:layout_editor_absoluteY="305dp" />

    <Button
        android:id="@+id/di"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#29BF8B"
        android:text="/"
        tools:layout_editor_absoluteX="154dp"
        tools:layout_editor_absoluteY="382dp" />

    <EditText
        android:id="@+id/n1"
        android:layout_width="137dp"
        android:layout_height="51dp"
        android:backgroundTint="#611CA6"
        android:ems="10"
        android:inputType="number"
        android:text="numero 1"
        android:textAlignment="center"
        tools:layout_editor_absoluteX="21dp"
        tools:layout_editor_absoluteY="78dp" />

    <EditText
        android:id="@+id/n2"
        android:layout_width="133dp"
        android:layout_height="46dp"
        android:backgroundTint="#8721B3"
        android:ems="10"
        android:inputType="number"
        android:text="numero 2"
        android:textAlignment="center"
        tools:layout_editor_absoluteX="256dp"
        tools:layout_editor_absoluteY="78dp" />

    <TextView
        android:id="@+id/R"
        android:layout_width="112dp"
        android:layout_height="32dp"
        android:text="RESULTADO:"
        android:textAlignment="center"
        android:textColor="#000000"
        tools:layout_editor_absoluteX="144dp"
        tools:layout_editor_absoluteY="677dp" />

    <EditText
        android:id="@+id/RES"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="number"
        android:textAlignment="center"
        tools:layout_editor_absoluteX="100dp"
        tools:layout_editor_absoluteY="751dp" />

</androidx.constraintlayout.widget.ConstraintLayout>